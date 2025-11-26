package day08.q02;

public class Magic {
	private String name;

	// 問題解答
	// フィールド
	public Magic(String name) {
		this.name = name;
	}

	// 出力メソッド
	public void attack(int mp, Monster monster) {
		System.out.println("\n" + name + "の攻撃！！");
		int damege = (int) (Math.random() * mp) + 10;
		System.out.println("相手に" + damege + "のダメージ！！");
		// HP を減らす
		monster.setHp(monster.getHp() - damege);
	}

}
