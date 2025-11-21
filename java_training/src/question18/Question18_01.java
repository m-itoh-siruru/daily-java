package question18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question18_01 {
	
	// メインメソッド 処理がスタート
	public static void main(String[] args) {
		// 日付を取得するオブジェクト
		 Date date = new Date();
		 
		 // 書式化文字列を指定するオブジェクト
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		 System.out.println("今日の日付を表示します。");
		 System.out.println(sdf.format(date));

	}

}
