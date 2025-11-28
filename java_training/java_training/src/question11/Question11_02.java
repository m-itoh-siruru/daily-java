package question11;

class Human {
	double height;
	double weight;
	String food;
}

public class Question11_02 {

	public static void main(String[] args) {
		Human me = new Human();
		
		me.height = 52.3;
		me.weight = 4.8;
		me.food = "ささみ";
		
		System.out.println("身長は" + me.height + "cmです");
		System.out.println("体重は" + me.weight + "kgです");
		System.out.println("好きな食べ物は" + me.food + "です");
	
	}

}
