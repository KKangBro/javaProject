package exam;

public class Prob2 {

	public static void main(String[] args) {
		System.out.println(leftPad("Samsung", 10, '#'));
		System.out.println(leftPad("SDS", 5, '*'));
		System.out.println(leftPad("Multicampus", 5, '@'));
	}

	public static String leftPad(String str, int size, char fillChar) {
		String rst = null;
		try {
			if (str.length() > size) {
				throw new IllegalSizeException("문자열의 길이보다 size가 큽니다.");
			} else {
				char[] charArr = new char[size - str.length()];

				for (int i = 0; i < charArr.length; i++) {
					charArr[i] = fillChar;
				}

				rst = new String(charArr);
				rst += str;
			}
		} catch (IllegalSizeException e) {
			return e.getMessage();
		}
		return rst;
	}
}

class IllegalSizeException extends Exception {

	IllegalSizeException() {
	}

	IllegalSizeException(String message) {
		super(message);
	}
}
