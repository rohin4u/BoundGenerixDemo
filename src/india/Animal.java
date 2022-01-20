package india;

public class Animal<T extends Dog & Cat> {
	
	T ob;
	
	public Animal(T ob) {
		this.ob=ob;
	}
	

	public T display() {
		return ob;
	}
	
	

}
