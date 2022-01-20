package india;

public class MyTest {

	public static void main(String[] args) {
		
		Animal<Dog> a = new Animal<Dog>(new Dog(10));
		System.out.println(a.display());
		System.out.println(a.display().show(1000));
		

	}

}
