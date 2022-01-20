package spider;

public class Animal<T extends Dog> {
	
	T ob;
	
	public Animal(T ob) {
		this.ob=ob;
	}
	

	public T display() {
		return ob;
	}
	
	

}
