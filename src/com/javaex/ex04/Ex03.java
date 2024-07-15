package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {

		// *** 문자열로 읽어옹면 깨짐 >>>  이미지로 가져오기 (파츠 끼는느낌으로 이해)
	
	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		BufferedReader fb= new BufferedReader(fr);
		
		while(true) {
			String str = fb.readLine();
			
			
			if(str == null) {
				System.out.println("끄읏");
				break;
			}
			System.out.println(str);
		}
		fb.close();
	}
	
}
