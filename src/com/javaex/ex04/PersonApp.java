package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class PersonApp {

	public static void main(String[] arsg) throws IOException {

		// 읽기
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");

		BufferedReader br = new BufferedReader(isr);

		// 쓰기
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-plus.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);

		BufferedWriter bw = new BufferedWriter(osw);

		ArrayList<Person> parsonList = new ArrayList<Person>();

		while (true) {
			
			String str = br.readLine();
			if(str == null) {
				break;
			} 

			
			String[] sArray = str.split("#");

			Person result = new Person(sArray[0], sArray[1], sArray[2]);

			parsonList.add(result);

		}
		for (int i = 0; i < parsonList.size(); i++) {
			parsonList.get(i).showInfo();

		}

	}

}
