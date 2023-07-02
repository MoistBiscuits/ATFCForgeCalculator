package anvil;

public class AnvilMedium extends SmithAction implements AnvilAction {

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return -6;
	}

	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {-6};
	}
	
	@Override
	public String toString() {
		return "medium";
	}
}
