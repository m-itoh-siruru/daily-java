package question10;

public class Question10_02 {
	public static void main(String[] args) {
		// 1回目の繰り返し（カウントアップ）
		System.out.println("1 回目の繰り返し処理です");
		int i = 0;
		while (i < 5) {
			System.out.println((i + 1) + "回目");
			i++; // for文の変化式 i++
		}

		// 2回目の繰り返し（カウントダウン）
		System.out.println("2 回目の繰り返し処理です");
		i = 5;
		while (i > 0) {
			System.out.println(i + "回目");
			i--; // for文の変化式 i--
		}
		
		System.out.println("処理を終了します");
	}
}
// for 文：初期化・条件式・変化式がまとめて書ける
// while 文：初期化と変化式をループ外／ループ内で分けて書く