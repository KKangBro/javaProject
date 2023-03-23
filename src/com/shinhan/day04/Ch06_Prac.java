package com.shinhan.day04;

import java.util.Scanner;

public class Ch06_Prac {

	public static void main(String[] args) {
		method6_20_BankApplication();
	}

	private static void method6_20_BankApplication() {
		Account_6_20[] accArray = new Account_6_20[100];
		int index = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("--------\n계좌생성\n--------");
				System.out.print("계좌번호: ");
				String tempAccNo = sc.nextLine();
				System.out.print("계좌주: ");
				String tempName = sc.nextLine();
				System.out.print("초기입금액: ");
				int tempBalance = Integer.parseInt(sc.nextLine());
				accArray[index] = new Account_6_20(tempAccNo, tempName, tempBalance);
				index++;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			case 2:
				System.out.println("--------\n계좌목록\n--------");
				for (int i = 0; i < index; i++) {
					System.out.println(accArray[i].getAccNo() + "\t" + accArray[i].getName() + "\t" + accArray[i].getBalance());
				}
				break;
			case 3:
				System.out.println("--------\n예금\n--------");
				System.out.print("계좌번호: ");
				String targetAccNo = sc.nextLine();
				System.out.print("예금액: ");
				int amount = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < index; i++) {
					if (accArray[i].getAccNo().equals(targetAccNo)) {
						accArray[i].setBalance(accArray[i].getBalance() + amount);
					}
				}
				break;
			case 4:
				System.out.println("--------\n출금\n--------");
				System.out.print("계좌번호: ");
				targetAccNo = sc.nextLine();
				System.out.print("출금액: ");
				amount = Integer.parseInt(sc.nextLine());
				for (int i = 0; i < index; i++) {
					if (accArray[i].getAccNo().equals(targetAccNo)) {
						accArray[i].setBalance(accArray[i].getBalance() - amount);
					}
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다..");
				System.exit(0);
			}
		}
	}

	public static class Account_6_20 {
		private String accNo;
		private String name;
		private int balance;

		public Account_6_20(String accNo, String name, int balance) {
			this.accNo = accNo;
			this.name = name;
			this.balance = balance;
		}

		public String getAccNo() {
			return accNo;
		}

		public void setAccNo(String accNo) {
			this.accNo = accNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}

		public void deposit(int amount) {
			balance += amount;
		}

		public boolean withdraw(int amount) {
			if (amount > balance) {
				return false;
			} else {
				balance -= amount;
				return true;
			}
		}
	}

	private static void method6_19() {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

	public static class Account {
		private int balance;
		static final int MIN_BALANCE = 0;
		static final int MAX_BALANCE = 1_000_000;

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
				return;
			}
			this.balance = balance;
		}
	}

	private static void method6_18() {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

	public static class ShopService {
		private static ShopService ss;

		private ShopService() {

		}

		public static ShopService getInstance() {
			if (ss == null)
				ss = new ShopService();
			return ss;
		}
	}

	private static void method6_16_17() {
		Printer printer = new Printer();
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

	public static class Printer {
		static void println(int a) {
			System.out.println(a);
		}

		static void println(boolean a) {
			System.out.println(a);
		}

		static void println(double a) {
			System.out.println(a);
		}

		static void println(String a) {
			System.out.println(a);
		}
	}

	private static void method6_15() {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

	public static class MemberService {
		String id = "hong";
		String password = "12345";

		public boolean login(String id, String password) {
			if (this.id.equals(id) && this.password.equals(password))
				return true;
			else
				return false;
		}

		public void logout(String id) {
			System.out.println(id + "님이 로그아웃 되었습니다.");
		}
	}

	// 6_13, 6_14
	public class Member {
		String name;
		String id;
		String password;
		int age;

		public Member(String name, String id) {
			this.name = name;
			this.id = id;
		}
	}

	// 6_12: 필드, 생성자, 메서드
	// 6_11: 3번
	// 6_10: 4번
	// 6_9: 2번
	// 6_8: 2번
	// 6_7: 2번
	// 6_6: 4번
	// 6_5: 1번
	// 6_4: 4번
	// 6_3: 4번
	// 6_2: 4번
	// 6_1: 3번

}
