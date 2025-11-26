package day07.q02;

public class Member {
	private int id;
	private String name;

	// 引数ありコンストラクタ※値を代入するとき
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void show() {
		System.out.println(this.id + ":" + this.name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
