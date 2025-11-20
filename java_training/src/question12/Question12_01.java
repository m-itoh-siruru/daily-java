package question12;

class Dog {
	String name;

	public void showName() {
		System.out.println("名前は" + name + "です");
	}
}

public class Question12_01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.name = "ダニエル";
		
		dog.showName();

	}

}
