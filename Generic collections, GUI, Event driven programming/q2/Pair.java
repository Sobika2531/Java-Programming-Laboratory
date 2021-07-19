package q2;

public class Pair<F,S> {
	private F fir;
	private S sec;
	
	public Pair(F f,S s)
	{
		fir=f;
		sec=s;
	}
	
	public F getFirst() {
		return this.fir;
	}

	public void setFirst(F f) {
		this.fir=f;
	}
	
	public S getSecond() {
		return this.sec;
	}
	
	public void setSecond(S s) {
		this.sec=s;
	}
}
