//追加問題
//  
//パッケージ名 day5.q2
//クラス名1 ConsoleReader.java IDを入力するクラス
//クラス名2 Validation.java ログインの認証をするクラス
//クラス名3 Main.java オブジェクト生成し、プログラムを実行するクラス
//
//IDをコンソールから入力し、ログイン認証するシステムを作成します。以下の要件に従って実装しなさい
// 
//【ConsoleReaderクラス】
//  inputIdメソッドを以下の要件に従い実装しなさい。
//  ・戻り値の型：int
//  ・メソッド名：inputId
//  ・引数：なし
//  ・throws IOException
//  処理：コンソールから入力を行い、整数に変換する。
//        変換した整数をreturnする。
// 
//【Validationクラス】
//  checkIdメソッドを以下の要件に従い実装しなさい。
//  ・戻り値の型：boolean
//  ・メソッド名：checkId
//  ・引数：int型
//  処理：引数の値が1111または2222の場合はtrue、
//  　上記以外の数字の場合はfalseをreturnする。
//  　※boolean型の変数をreturnしてもよい。
// 
//【Mainクラス】
//  メインメソッド（throws IOException）の内に以下の処理を行う。
//  ・ConsoleReaderとValidationのオブジェクトを生成
//  ・ログイン状態を判定するboolean型の変数を宣言
//  ・ID番号を格納するint型の変数を宣言
//  ・while文（未ログイン状態なら繰り返す。）
//  		whileブロックの中に
//  		・ConsoleReaderクラスのinputId()を呼び出す
//  		・上記のコンソール入力値を引数にしてValidationクラスのcheckId(id)を呼び出す。
//  		・checkIdの結果がtrueならログイン成功。ループから抜ける処理をする。
//  		・checkIdの結果がfalseならログイン失敗。ループにもどる。
// 
//【出力例】
//4ケタのログインIDを入力してください
//
//input id? >>1234
//ログインできません
//もう一度入力してください
//
//input id? >>3333
//ログインできません
//もう一度入力してください
//
//input id? >>1111
//ログインに成功しました
//ようこそ、ID:1111さん

package day05.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// IDを入力するクラス
class ConsoleReader {
	public int inputId() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input id? >> ");
		String str = reader.readLine();
		return Integer.parseInt(str); // 整数に変換して返す
	}
}

// ログイン認証を行うクラス
class Validation {
	public boolean checkId(int id) {
		return (id == 1111 || id == 2222); // 1111か2222ならtrue、それ以外はfalse
	}
}

// メインクラス
public class Main {
	public static void main(String[] args) throws IOException {
		ConsoleReader reader = new ConsoleReader(); // オブジェクト生成
		Validation validator = new Validation(); // オブジェクト生成

		boolean loggedIn = false; // ログイン状態
		int id = 0; // 入力ID格納用

		System.out.println("4ケタのログインIDを入力してください");

		while (!loggedIn) { // 未ログイン状態なら繰り返す
			id = reader.inputId(); // IDを入力
			loggedIn = validator.checkId(id); // 認証

			if (loggedIn) {
				System.out.println("ログインに成功しました");
				System.out.println("ようこそ、ID:" + id + "さん");
			} else {
				System.out.println("ログインできません");
				System.out.println("もう一度入力してください");
			}
		}
	}
}
