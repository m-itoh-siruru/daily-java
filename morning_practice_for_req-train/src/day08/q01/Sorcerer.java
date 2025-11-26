package day08.q01;

// 引き継ぐ
public class Sorcerer extends Magic {
	// スーパークラスのコンストラクタを呼び出す
	public Sorcerer(String name) {
		super(name);

	}

	public void attack(int mp) {
		// Magicクラスの攻撃処理
		super.attack(mp);

		// 追加ダメージ
		int addDamage = (int) (mp * 0.5);
		System.out.println("追加で" + addDamage + "のダメージを与えた。");

	}
}
