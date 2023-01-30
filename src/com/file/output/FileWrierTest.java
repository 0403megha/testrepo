package com.file.output;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class FileWrierTest {

	public static void main(String[] args) {
		try {
    Writer w=new FileWriter("F:\\New folder\\testclass.txt");
    String s="Megha";
    w.write(s);
    w.flush();
    System.out.println("success");
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
