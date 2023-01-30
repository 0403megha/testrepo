package com.file.input;

import java.io.File;

public class AllFiles {

	public static void main(String[] args) {
    File file=new File("F:\\New folder\\");
    File[] f=file.listFiles();
    for(File f1:f) {
    	System.out.println("All File Names"+f1 +"file length"+f1.length());
    }
	}

}
