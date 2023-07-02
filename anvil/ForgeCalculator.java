package anvil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ForgeCalculator {
	static AnvilAction[] anvilActions = new AnvilAction[] {
			new AnvilBend(),
			new AnvilDraw(),
			new AnvilHeavy(),
			new AnvilLight(),
			new AnvilMedium(),
			new AnvilPunch(),
			new AnvilShrink(),
			new AnvilUpset()
	}; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmithActionListFactory smithActionListFactory = new SmithActionListFactory();
		try {
			//System.out.println(CalcSmithCost(smithActionListFactory.GetSmithActionList("upset hit punch")));
			System.out.println(ActionsFromRecipe(smithActionListFactory.GetSmithActionList("hit draw bend")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<AnvilAction> ActionsFromRecipe(List<SmithAction> recipe) {
		Collections.reverse(recipe);
		List<List<AnvilAction>> soloutions = new ArrayList<List<AnvilAction>>();
		for(AnvilRecipe item : CalcSmithCost(recipe)) {
			List<AnvilAction> list = new ArrayList<AnvilAction>();
			list.addAll(CalcAnvilActions(0-item.getOffset()));
			list.addAll(item.getActions());
			soloutions.add( list );
		}
		Collections.sort(soloutions, new Comparator<List<AnvilAction>>(){
		    public int compare(List<AnvilAction> a1, List<AnvilAction> a2) {
		        return a1.size() - a2.size();
		    }
		});
		return soloutions.get(0);
	}

	/*
	 * Calculate all potential smithing offsets for a combination of SmithActions to complete
	 * Actions list is read as first action happens first
	 */
	public static List<AnvilRecipe> CalcSmithCost(List<SmithAction> actions) {
		List<AnvilRecipe> recipes = new ArrayList<AnvilRecipe>();
		recipes.add(new AnvilRecipe());
		for (SmithAction action : actions) {
			List<AnvilRecipe> newRecipes = new ArrayList<AnvilRecipe>();
			for (AnvilRecipe recipe : recipes) {
				for (AnvilAction anvilAction : action.getAllAnvilActions()) {
					AnvilRecipe r = new AnvilRecipe(new ArrayList<AnvilAction>(),recipe.getOffset() + anvilAction.GetValue());
					r.getActions().addAll(recipe.getActions());
					r.addAction(anvilAction);
					newRecipes.add(r);
				}
			}
			recipes = newRecipes;
		}
		return recipes;
	}
	
	public static List<AnvilAction> CalcAnvilActions(AnvilAction[] availableActions, Integer target, List<AnvilAction> actions, int stepMax) {
		if (stepMax == 0) {
			return null;
		}
		int s = 0;
		for (AnvilAction x: actions) s += x.GetValue();
		if (s == target)
			return actions;
		List<List<AnvilAction>> soloutions = new ArrayList<List<AnvilAction>>();
		int fastestStep = stepMax - 1;
		for(AnvilAction action : availableActions) {
			int n = action.GetValue();
			ArrayList<AnvilAction> actions_rec = new ArrayList<AnvilAction>(actions);
			actions_rec.add(action);
			List<AnvilAction> x = CalcAnvilActions(availableActions,target,actions_rec,fastestStep);
			if (x != null) {
				soloutions.add(x);
				if (fastestStep > x.size()) {
					fastestStep = x.size();
				}
			} 
		}
		if (soloutions.isEmpty()) {
			return null;
		}
		Collections.sort(soloutions, new Comparator<List<AnvilAction>>(){
		    public int compare(List<AnvilAction> a1, List<AnvilAction> a2) {
		        return a1.size() - a2.size();
		    }
		});
		return soloutions.get(0);
				
	}
	
	public static List<AnvilAction> CalcAnvilActions(Integer target) {
		return CalcAnvilActions(anvilActions,target,new ArrayList<AnvilAction>(),12);
	}
	
	
}
