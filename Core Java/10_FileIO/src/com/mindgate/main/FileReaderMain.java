package com.mindgate.main;

import com.mindgate.main.util.FileReaderUtil;

public class FileReaderMain {
	public static void main(String[] args) {
		FileReaderUtil fileReaderUtil = new FileReaderUtil("c:/fileIO/Mindgate.txt");

		char[] data = fileReaderUtil.getDataFromFile();

		for (char c : data) {
			System.out.print(c);
		}
	}
}
