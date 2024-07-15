package com.javaex.ex03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		
		//  1. <<메모리에 2개 올렸는데 둘이 아직 연결 ㄴㄴ>>
		InputStream in = new FileInputStream("C:\\javaStudy\\al.jpg");
		
		BufferedInputStream bin = new BufferedInputStream(in);		//  2. in으로 주소값 넣어줘서 둘 연결 	
		
		bin.read();			//in.read(); >> 연결되기 전 주소값 읽는격. buffered를 못쓴다ㅇㅇ		
		in.close();
		
	}
	
}
