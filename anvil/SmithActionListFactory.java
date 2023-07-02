package anvil;

import java.util.ArrayList;
import java.util.List;

public class SmithActionListFactory {
	public List<SmithAction> GetSmithActionList(String x) throws Exception {
		String[] list = x.split("\\s+");
		List<SmithAction> actions = new ArrayList<SmithAction>();
		
		for (String item : list) {
			item = item.toLowerCase();
			switch (item) {
			case "bend":
				actions.add(new AnvilBend());
				break;
			case "draw":
				actions.add(new AnvilDraw());
				break;
			case "heavy":
				actions.add(new AnvilHeavy());
				break;
			case "hit":
				actions.add(new AnvilHit());
				break;
			case "light":
				actions.add(new AnvilLight());
				break;
			case "medium":
				actions.add(new AnvilMedium());
				break;
			case "punch":
				actions.add(new AnvilPunch());
				break;
			case "shrink":
				actions.add(new AnvilShrink());
				break;
			case "upset":
				actions.add(new AnvilUpset());
				break;
			default:
				throw new Exception();
			}
		}
		
		return actions;
	}
}
