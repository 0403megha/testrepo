package com.file.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTesting {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("F:\\New folder\\testout.txt");
			int i = 0;
			while((i=file.read()) !=-1 ) {
				System.out.print((char)i);
				file.close();
			}
			
			//System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
