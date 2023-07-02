package anvil;

public class AnvilBend extends SmithAction implements AnvilAction{

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {7};
	}

	@Override
	public String toString() {
		return "bend";
	}

}
