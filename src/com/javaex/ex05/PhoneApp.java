package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader ir = new InputStreamReader(in, "utf-8"); // 작성되어있는형식

		BufferedReader br = new BufferedReader(ir);
		ArrayList<PhoneDb> phoneList = new ArrayList<PhoneDb>();

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}

			String[] sArray = str.split(",");
			PhoneDb result = new PhoneDb(sArray[0], sArray[1], sArray[2]);
			phoneList.add(result);

		}
		for (int i = 0; i < phoneList.size(); i++) {
			phoneList.get(i).showInfo();
		}
		br.close();
	}
}
