package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	// 텍스트로 읽어오면 한글 깨짐. 10101 2진수로 변환. >> InputStream => Reader => Buffered(속도개선)

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949"); // MS949를 번역한다고 값 넣어주기

		BufferedReader bf = new BufferedReader(isr);

		while (true) {
			String str = bf.readLine();

			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		bf.close();
		System.out.println("프로그램 종료");
	}

}
