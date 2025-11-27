package day09.q02;

public abstract class Instrument {
	// 子クラスからも見えるように protected
	protected String maker; 
	
	// コンストラクタ
	public Instrument(String maker) {
		this.maker = maker;
	}

	// 抽象メソッド
	public abstract void playMusic();

	@Override
	public abstract String toString();
}
