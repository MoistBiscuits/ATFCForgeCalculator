package anvil;

public class AnvilHeavy extends SmithAction implements AnvilAction {

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return -9;
	}

	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {-9};
	}
	
	@Override
	public String toString() {
		return "heavy";
	}
}
