package com.file.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BuffredInputstream {

	public static void main(String[] args) {
    try {
		FileInputStream fis=new FileInputStream("F:\\New folder\\testout.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i=0;
		while((i=bis.read())!=-1) {
			System.out.print((char)i);
			
		}
			
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
