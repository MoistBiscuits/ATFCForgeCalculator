package anvil;

public class AnvilUpset extends SmithAction implements AnvilAction {

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return 13;
	}

	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {13};
	}
	
	@Override
	public String toString() {
		return "upset";
	}
}
