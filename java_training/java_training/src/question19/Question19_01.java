package question19;

class Test { // public にしないなら同じファイルでも OK
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}

public class Question19_01 {
	public static void main(String[] args) {
		Test t = new Test(); // Test オブジェクト生成
		t.setStr("Hello World"); // 文字列を設定
		System.out.println(t.getStr()); // 表示
	}
}
