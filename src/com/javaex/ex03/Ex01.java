package com.javaex.ex03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	// 코드 걍 외우기 ㅇㅇ
	public static void main(String[] args) throws IOException {

		// 읽기 스트림
		// 1. <<메모리에 2개 올렸는데 둘이 아직 연결 ㄴㄴ>>
		InputStream in = new FileInputStream("C:\\javaStudy\\al.jpg");
		BufferedInputStream bin = new BufferedInputStream(in); // 2. in으로 주소값 넣어줘서 둘 연결

		// 쓰기 스트림
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		System.out.println("복사시작");
		while (true) {
			int data = bin.read();

			if (data == -1) {
				System.out.println("끄ㅜㅌ");
				break;
			}

			bout.write(data);

		}
		bin.read(); // in.read(); >> 연결되기 전 주소값 읽는격. buffered를 못쓴다ㅇㅇ
		in.close();
	}
}