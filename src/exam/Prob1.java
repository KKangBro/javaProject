package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	public static void main(String[] args) {
		String[] array = { "황남기85점", "조성호89점", "한인성88점", "독고정진77점" };
		printMaxScore2(array);
	}
	
	private static void printMaxScore2(String[] array) {
		int maxScore = 0;
		String maxName = "";
		
		for (String str : array) {
			Pattern pattern = Pattern.compile("([가-힣a-zA-Z]+)([0-9]+)점");
			Matcher matcher = pattern.matcher(str);
			
			while(matcher.find()) {
				String name = matcher.group(1);
				int score = Integer.parseInt(matcher.group(2));
//				System.out.println(name + " : " + score);
				
				if (maxScore < score) {
					maxScore = score;
					maxName = name;
				}
			}
		}
		
		System.out.println("최고점수는 " + maxName + "님 " + maxScore + "점 입니다.");
	}

	private static void printMaxScore(String[] array) {
		int maxScore = 0;
		String maxName = "";

		for (String str : array) {
			String name = "";
			String temp = "";

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);

				if (c == '점')
					break;

//				if (c >= '0' && c <= '9') {
				if (Character.isDigit(c)) {
					temp += c;
				} else {
					name += c;
				}
			}

			int score = Integer.parseInt(temp);
			if (maxScore < score) {
				maxScore = score;
				maxName = name;
			}
		}

		System.out.println("최고점수는 " + maxName + "님 " + maxScore + "점 입니다.");
	}
}
