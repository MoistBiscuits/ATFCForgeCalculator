package anvil;

import java.util.ArrayList;
import java.util.List;

public class AnvilRecipe {
	List<AnvilAction> actions;
	Integer offset;
	
	public AnvilRecipe() {
		this.actions = new ArrayList<AnvilAction>();
		offset = 0;
	}
	
	public AnvilRecipe(List<AnvilAction> actions,Integer offset) {
		this.actions = actions;
		this.offset = offset;
	}
	
	public List<AnvilAction> getActions() {
		return actions;
	}
	
	public Integer getOffset() {
		return offset;
	}
	
	public void addAction(AnvilAction action) {
		actions.add(action);
	}
	
	public void setOffset(Integer value) {
		offset = value;
	}
	
	public String toString() {
		return getActions().toString() + " : " + offset.toString();
	}
}
