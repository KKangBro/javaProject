package exam;

class Prob3 {
	public static void main(String args[]) {
		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);
		skt.printCharge();
		ktf.printCharge();
		lgt.printCharge();
	}
}

class PhoneCharge {
	private String user;
	private int call;
	private int sms;
	private int data;
	private int total;

	public PhoneCharge(String user, int call, int sms, int data) {
		this.user = user;
		this.call = call;
		this.sms = sms;
		this.data = data;
		total = calcCharge();
	}

	public int calcCharge() {
		int callFee = call >= 200 ? call * 10 * 2 : call * 10;
		int smsFee = sms >= 300 ? sms * 20 * 4 : sms * 20;
		int dataFee = data >= 7 ? data * 1000 * 2 : data * 1000;

		return callFee + smsFee + dataFee;
	}

	public void printCharge() {
		System.out.println(user + " 사용자는 이번달에 사용하신 전화요금이 " + total + " 원입니다.");
	}

}
