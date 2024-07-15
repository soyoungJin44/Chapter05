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

public class Ex04 {

	// 텍스트로 읽어오면 한글 깨짐. 10101 2진수로 변환. >> InputStream => Reader => Buffered(속도개선)

	public static void main(String[] args) throws IOException {
		// <읽기 스트림>
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949"); // MS949를 번역한다고 값 넣어주기

		BufferedReader bf = new BufferedReader(isr);
		
		//<쓰기 스트림>
		OutputStream ot = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");		//ms949-copy 빈파일 생김
		OutputStreamWriter ow = new OutputStreamWriter(ot, "MS949");		//***
		
		BufferedWriter bw = new BufferedWriter(ow);

		while (true) {
			String str = bf.readLine();
			
			if (str == null) {
				break;
			}
			//System.out.println(str);
			bw.write(str);
			bw.newLine();	//줄바꿈	
			
		}
		bf.close();
		bw.close();
		System.out.println("프로그램 종료");
	}

}
