package com.mindgate.main.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderUtil {

	private File file = null;
	private Reader reader = null;
	private char[] data;

	public FileReaderUtil(String filePath) {
		file = new File(filePath);
		int filesize = (int) file.length();
		data = new char[filesize];

		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("Invalid file path");
			e.printStackTrace();
		}
	}

	public char[] getDataFromFile() {
		try {
			reader.read(data);
		} catch (IOException e) {
			System.out.println("Failed to read file");
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Failed to close file");
				e.printStackTrace();
			}
		}
		return data;
	}

}
