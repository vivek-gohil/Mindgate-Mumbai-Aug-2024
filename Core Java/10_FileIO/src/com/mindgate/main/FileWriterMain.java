package com.mindgate.main;

import com.mindgate.main.util.FileWriterUtil;

public class FileWriterMain {
	public static void main(String[] args) {
		String data = "This is new new sample data";

		FileWriterUtil fileWriterUtil = new FileWriterUtil("c:/fileIO/mindgate.txt",
				data.toCharArray());

		fileWriterUtil.writeFile();

		System.out.println("Please check your file");
	}
}
