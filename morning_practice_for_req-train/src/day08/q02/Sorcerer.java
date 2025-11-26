package day08.q02;

// 引き継ぐ
public class Sorcerer extends Magic {
	// スーパークラスのコンストラクタを呼び出す
	public Sorcerer(String name) {
		super(name);

	}

	public void attack(int mp, Monster monster) {
		// Magicクラスの攻撃処理
		super.attack(mp, monster);

		// 追加ダメージ
		int addDamage = (int) (mp * 0.5);
		System.out.println("追加で" + addDamage + "のダメージを与えた。");
		// モンスターのHPを減らす
		monster.setHp(monster.getHp() - addDamage);

	}
}
