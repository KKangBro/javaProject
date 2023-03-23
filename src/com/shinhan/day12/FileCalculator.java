package com.shinhan.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCalculator {

	public static void main(String[] args) throws Exception {
		new FileCalculator().addCalculateResult("data.txt");
	}

	void addCalculateResult(String inputFileName) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));

		String row;
		int sum = 0, multiply = 1;
		while ((row = br.readLine()) != null) {
//			System.out.println(row);
			sum += Integer.parseInt(row);
			multiply *= Integer.parseInt(row);
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName, true));
		bw.newLine();
		bw.write(sum + "");
		bw.newLine();
		bw.write(multiply + "");
		bw.close();

	}

}
