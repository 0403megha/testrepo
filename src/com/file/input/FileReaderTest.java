package com.file.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
    try {
		Reader r=new FileReader("F:\\New folder\\myfile1.txt");
		int count=0;
		while((count=r.read())!=-1) {
			System.out.print((char)count);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
