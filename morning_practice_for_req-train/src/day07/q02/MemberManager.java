package day07.q02;

class MemberManager {

	// インスタンスを作らせないためのprivateコンストラクタ
	private MemberManager() {
	}

	// 一覧表示
	public static void show(Member[] list) {
		System.out.println("メンバー一覧を表示します");
		for (Member m : list) {
			m.show();
		}
		System.out.println();
	}

	// 更新
	public static void update(Member[] list, int id, String name) {
		System.out.println("ID：" + id + "のメンバー名を" + name + "に更新します");
		System.out.println();

		for (Member m : list) {
			if (m.getId() == id) {
				m.setName(name);
			}
		}
	}
}
