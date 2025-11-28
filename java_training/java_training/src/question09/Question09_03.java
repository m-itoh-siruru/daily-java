package question09;

public class Question09_03 {

	public static void main(String[] args) {
		int point = 45; // テストしたい数字を入れる

		if (point >= 80) {
			System.out.println("テストの点数は優秀です\nお疲れ様でした");

		} else if (point < 80 && point >= 50) {
			System.out.println("テストの点数は平均点です\nお疲れ様でした");

		} else if (point < 50 && point >= 30) {
			System.out.println("テストの点数は及第です\nお疲れ様でした");
		} else {
			System.out.println("赤点のため追試が必要です\nお疲れ様でした");
		}
	}

}
