package anvil;

public class AnvilPunch extends SmithAction implements AnvilAction {

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {2};
	}
	
	@Override
	public String toString() {
		return "punch";
	}
}
