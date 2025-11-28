package question10;

public class Question10_05 {

	public static void main(String[] args) {
		// 外側の for 文：行を制御（3行）
		for (int i = 0; i < 3; i++) {
			// 内側の for 文：列を制御（5列）
			for (int j = 0; j < 5; j++) {
				System.out.print("*"); // 改行なしで横に並べる
			}
			System.out.println(); // 1行終わったら改行
		}
	}
}