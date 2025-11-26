package day07.q01;

public class Drink {
	private int price;
	private String name;

	// 初期値のコンストラクタ
	public Drink() {
		this.price = 120;
		this.name = "ビタミン麦茶";
	}

	//　引数ありのコンストラクタ※値を代入するとき
	public Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public void show() {
		System.out.println(this.name + ":" + this.price + "円です。");
	}

}
