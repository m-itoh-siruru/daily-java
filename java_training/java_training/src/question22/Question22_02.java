package question22;

public class Question22_02 {
	public static void main(String[] args) {
		// Frogクラスのオブジェクトを2つ生成
		Frog frog1 = new Frog();
		Frog frog2 = new Frog();

		// オブジェクトの比較
		if (frog1 == frog2) {
			System.out.println("変数 frog1 と変数 frog2 は同じものです"); // 実行結果1
		} else {
			System.out.println("変数 frog1 と変数 frog2 は違うものです"); // 実行結果2
		}
	}
}