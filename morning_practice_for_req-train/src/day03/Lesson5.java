/* 追加問題

パッケージ名 day03
クラス名 Lesson5.java

 要素数2のboolean型の配列を作成し、以下の手順通りに代入と取得を行いなさい。
 【出力例】
①配列の要素0番目にtrueを代入する。
②コンソールから以下の入力例に沿って入力を行い、表示する。表示の際は配列から値を取得すること
③条件分岐にはswitch文を用いること

【出力例1】
input number[0or1]? >>0
配列の0番目はtrueです。
【出力例2】
input number[0or1]? >>1
配列の1番目はfalseです。
【出力例3】
input number[0or1]? >>2
配列の範囲外の値が入力されました
*/
package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson5 {

	public static void main(String[] args) throws IOException {
		System.out.println("input number[0or1]? >>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		boolean[] num = {true, false};
		// 要素は 2つで、num[0] = true、num[1] = false
		String str = reader.readLine();
		int input = Integer.parseInt(str);

		switch (input) {
		case 0:
			System.out.println("配列の0番目は" + num[0] + "です。");
			break;

		case 1:
			System.out.println("配列の1番目は" + num[1] + "です。");
			break;

		case 2:
			System.out.println("配列の範囲外の値が入力されました");
			break;

		}

	}
}
