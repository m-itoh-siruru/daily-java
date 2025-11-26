package day08.q02;

public class Monster {
	// フィールド
	private String name;
	private int hp;

	// コンストラクタ
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println(name + "が現れた！！");
		System.out.println(this.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String toString() {
		return "Monster [name=" + name + ", hp=" + hp + "]";
	}
}
