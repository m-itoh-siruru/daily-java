package day09.q02;

public class Piano extends Instrument {

	private double weight;

	public Piano(String maker) {
		super(maker); // Instrumentのコンストラクタへ
		this.weight = 80.5;
	}

	@Override
	public void playMusic() {
		System.out.println(maker + "のピアノを弾きます。");
	}

	@Override
	public String toString() {
		return "Piano [weight=" + weight + ", maker=" + maker + "]";
	}
}
