
public class Pair<T> {

	private T first;
	private T second;
	
	public Pair() {
		first = null;
		second = null;
	}
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public boolean equals(Pair otherPair) {
		if(otherPair.first.equals(this.first)
				&& otherPair.second.equals(this.second)) {
			return true;
		} else return false;
	}
	
	public String toString() {
		String n = "First: " + this.first + "\nSecond: " + this.second;
		return n;
	}
	
	
	
}
