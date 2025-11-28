//問題
//ArrayListに1～任意の整数値（コンソール入力）までの値を代入し表示する
//また、1～入力値までの合計を求めなさい。
//※入力値に整数以外が含まれていた場合、NumberFormatExceptionをキャッチし例外処理を行うこと
//【出力例】
//1から任意の値までの合計を求めます
//input num? >>13
//1から13までの合計は91
//listの要素を表示します
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13

package day10.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*ここから記入*/
		System.out.println("1から任意の値までの合計を求めます");
		System.out.print("input num? >>");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			// 文字列を入力
			String input = br.readLine();

			// 入力された文字列をint型に変換
			int num = Integer.parseInt(input);

			// ArrayListに1～numまでの整数値を追加
			ArrayList<Integer> list = new ArrayList<>();
			
			// 合計をためるための変数を初期化
			int sum = 0;
			// 1からnumまで順にループ
			for (int i = 1; i <= num; i++) {
				list.add(i);
				sum += i;
			}

			// 合計を表示
			System.out.println("1から" + num + "までの合計は" + sum);

			// 要素の表示
			System.out.println("listの要素を表示します");
			// istの要素を先頭から順に value に取り出して表示
			for (int value : list) {
				System.out.println(value);
			}

		} catch (NumberFormatException e) {
			System.out.println("整数値を入力してください（数字以外が含まれています）");
		
		} catch (IOException e) {
			e.printStackTrace();
		
		}
	
	}

}