package anvil;

public class AnvilHit extends SmithAction {
	@Override
	public int[] GetCost() {
		// TODO Auto-generated method stub
		return new int[] {-3,-6,-9};
	}
	
	@Override
	public String toString() {
		return "hit";
	}
	
	@Override
	public AnvilAction[] getAllAnvilActions() {
		return new AnvilAction[] {new AnvilLight(),new AnvilMedium(), new AnvilHeavy()};
	}
}
