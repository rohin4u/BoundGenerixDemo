package india;

public class Dog implements Cat {
	
	int i;
	
	public Dog(int i) {
		this.i=i;
	}
	public String toString() {
		return i+"";
	}
	@Override
	public int show(int i) {
		// TODO Auto-generated method stub
		return i;
	}

}
