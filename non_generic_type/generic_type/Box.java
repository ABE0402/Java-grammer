package generic_type;

public class Box<A> {
	private A t;
	public A get() {
		return t;
	}
	public void set(A t) {
		this.t = t;
	}
}
