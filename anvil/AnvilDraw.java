package anvil;

public class AnvilDraw extends SmithAction implements AnvilAction {

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return -15;
	}

	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {-15};
	}

	@Override
	public String toString() {
		return "draw";
	}
}
