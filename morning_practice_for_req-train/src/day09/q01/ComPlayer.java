package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable {
	@Override
	public int doJanken() throws IOException {
		int hand = (int) (Math.random() * 3);
		String[] names = { "グー", "チョキ", "パー" };

		System.out.println("コンピュータは" + names[hand] + "を選んだ");

		return hand;

	}
}
