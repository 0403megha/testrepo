package com.file.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStream {
public static void main(String[] args) throws IOException {
	try {
		FileOutputStream fos=new FileOutputStream("F:\\New folder\\write.txt");
		String write="Hi I'Am Megha Dongre";
		byte[] b=write.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("success.....");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
