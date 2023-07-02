package anvil;

public class AnvilLight extends SmithAction implements AnvilAction {

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return -3;
	}

	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {-3};
	}
	
	@Override
	public String toString() {
		return "light";
	}
}
