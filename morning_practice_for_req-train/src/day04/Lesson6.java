/*問題

パッケージ名 day04
クラス名 Lesson6.java

以下の手順に沿ってコンソールに表示を行いなさい
 
 ・String型配列を定義し"鈴木" "田中" "佐藤"を代入します
 ・for文を用い、配列から上記の文字列を取り出し、","を加えた上で一つの文字列変数に代入します。
 ・ただし、最後の要素の後には","をつけないでください。
 ・for文から抜けた後、上記文字列変数を出力して下さい

 【出力例】
カンマ区切りで配列を出力します
鈴木,田中,佐藤
*/

package day04;

public class Lesson6 {

	public static void main(String[] args) {
		String[] str = { "鈴木", "田中", "佐藤" };

		for (int i = 0; i < str.length; i++) {
		// 配列の要素を“順番に繰り返し取り出す”必要があるからforを使う

			if (i == str.length - 1) {
				System.out.print(str[i]);
				// 最後はカンマなし

			} else {
				System.out.print(str[i] + ",");
				// それ以外はカンマつける
			}

		}

	}
}