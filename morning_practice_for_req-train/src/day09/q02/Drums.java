package day09.q02;

public class Drums extends Instrument {

	private String constitution;

	public Drums(String maker) {
		super(maker);
		this.constitution = "バスドラム・スネアドラム・タムタム・シンバルのセットです";
	}

	@Override
	public void playMusic() {
		System.out.println(maker + "のドラムを演奏します。");
	}

	@Override
	public String toString() {
		return "Drums [constitution=" + constitution + ", maker=" + maker + "]";
	}
}
