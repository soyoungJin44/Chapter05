package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		
		//try catch문 써서 예외 처리하는게 맞음!
		//이미지를 in으로 빨대꼽고 데이터 가져오는법 (데이터값이 -1이 될 때 까지)
		 InputStream in = new FileInputStream("C:\\javaStudy\\al.jpg");
		 OutputStream out = new FileOutputStream("C:\\javaStudy\\alNew.jpg");
		 
		 
		 while(true) {
			 
			 int data = in.read();
			 System.out.println(data);
			 
			 if(data ==-1) {
				// System.out.println("다 읽었음");
				 break;
			 }
			 
			 out.write(data);
			 
		 }
		 System.out.println("복사 끄읏");
		 in.close();
		 out.close();
		 
	}
}
