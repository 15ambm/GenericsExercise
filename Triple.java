
public class Triple<T,H> {

	private T first;
	private H second;
	private T third;
	
	public Triple() {
		first = null;
		second = null;
		third = null;
	}
	
	public Triple(T first, H second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public boolean equals(Triple otherTriple) {
		if(otherTriple.first.equals(this.first)
				&& otherTriple.second.equals(this.second)
					&& otherTriple.third.equals(this.third)) {
			return true;
		} else return false;
	}
	
	public String toString() {
		String n = "First: " + this.first + "\nSecond: " + this.second  + "\nThird: " + this.third;
		return n;
	}
	
	
	
	
}
