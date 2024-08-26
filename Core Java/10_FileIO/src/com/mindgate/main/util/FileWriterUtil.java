package com.mindgate.main.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterUtil {
	private File file;
	private Writer writer;
	private char[] data;

	public FileWriterUtil(String filePath, char[] data) {
		file = new File(filePath);
		this.data = data;
		try {
			writer = new FileWriter(file, true);
		} catch (IOException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}
	}

	public void writeFile() {
		try {
			writer.write(data);
		} catch (IOException e) {
			System.out.println("Error whiel writing file");
			e.printStackTrace();
		} finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {
				System.out.println("Error while closing");
				e.printStackTrace();
			}

		}
	}

}
