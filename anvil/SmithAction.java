package anvil;

public abstract class SmithAction {
	public abstract int[] GetCost();
	public abstract String toString();
	public AnvilAction[] getAllAnvilActions() {
		return new AnvilAction[] {(AnvilAction) this};
	}
}
