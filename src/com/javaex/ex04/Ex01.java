package com.javaex.ex04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {
				
	// writer >> 텍스트
	
	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\javaStudy\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡땡땡");
		bw.newLine();  //줄바꿈
		bw.write("어서 모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다린당~");
		
		
		bw.close();
		
	}
	
}
