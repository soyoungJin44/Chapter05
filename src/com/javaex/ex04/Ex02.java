package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		BufferedReader fb = new BufferedReader(fr);

		// fb.read(); //읽기
		// fb.readLine(); //한줄씩 읽ㄱ기

		while (true) {
			String str = fb.readLine();
			System.out.println(str);
			
			if (str == null) {
				System.out.println("값이 없습니다.");
				break;
			}

		}
		fb.close();
	}
}
