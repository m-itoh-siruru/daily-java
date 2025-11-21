package day06.q02;

public class Bank {
	private String bankCode = "000111";
	private String bankName = "シェアード銀行";
	private Depositor depositor;

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Depositor getDepositor() {
		return depositor;
	}

	public void setDepositor(Depositor depositor) {
		this.depositor = depositor;
	}

	public void showData() {
		System.out.println("\n銀行情報を表示します");
		System.out.println("bankCode:" + bankCode);
		System.out.println("bankName:" + bankName);
		System.out.println("\n預金者情報を表示します");
		if (depositor != null) {
			depositor.showData();

		}

	}
}
