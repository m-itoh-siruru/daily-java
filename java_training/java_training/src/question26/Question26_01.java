package question26;

public class Question26_01 {
	public static void main(String[] args) {
		String str = "こんにちは";

		/*
		 try {
		問題が起きるかもしれない処理
		} catch (例外の種類) {
		問題が起きたときの処理
		}
		 */

		try {
			// strをint型に変換しようとしてるけどこんにちはだからできない
			int num = Integer.parseInt(str);
			System.out.println("変換したら" + num + "になりました");

		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました");
		}
	}
}
