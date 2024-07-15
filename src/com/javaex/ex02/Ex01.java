package com.javaex.ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
		 
		
	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\al.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\afs.jpg");
		
		//속도 빠르게 하기위해서 묶어서 빨아들인다고 생각하기
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작");
		while(true) {
			
			int data = in.read(buff);		//소음기를 단것처럼 보조적인 역활을한다. (보조스트림)
			System.out.println(data);		
			
			
			if(data == -1) {
				System.out.println("복사끝");
				break;   
			}
		}
		System.out.println("프로그램 끝");
		
		
		
		out.close();
		in.close();
		
	}

}
