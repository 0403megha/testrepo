package com.file.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("F:\\New folder\\testout.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			bis.skip(5);
			int count = bis.available();
			System.out.println(count);
			bis.skip(5);
			while((count=bis.read())!=-1 ) {
				System.out.print((char)count);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
