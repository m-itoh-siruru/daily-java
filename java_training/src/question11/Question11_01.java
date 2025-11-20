package question11;

class Cat {
	String name;
	int age;
}

public class Question11_01 {
	public static void main(String[] args) {
		Cat myCat = new Cat();

		myCat.name = "コウタロウ";
		myCat.age = 7;

		System.out.println("名前は" + myCat.name + "です");
		System.out.println("年齢は " + myCat.age + " 歳です");

	}

}
