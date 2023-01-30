package com.file.output;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BuffredOutputStreamTest {

	public static void main(String[] args) {
    try {
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("F:\\New folder\\myfile1.txt"));
		String s="Hi Am Software Developer";
		byte[] b=s.getBytes();
		bos.write(b);
		System.out.println("success........");
		bos.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
