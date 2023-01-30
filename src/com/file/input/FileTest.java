package com.file.input;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// mkdir()
		File file=new File("F:\\guddi");
		if(file.mkdir())
			System.out.println("Directory Is Created");
		else
			System.out.println("No Directory Is Created");

	}

}
