package anvil;
public class AnvilShrink extends SmithAction implements AnvilAction {

	@Override
	public int GetValue() {
		// TODO Auto-generated method stub
		return 16;
	}
	
	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {16};
	}
	
	@Override
	public String toString() {
		return "shrink";
	}
}
