package com.test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("F:/demo.txt");
			int content = 0;
			//用是否返回-1来判断是否读到了文件末尾
			while((content = fr.read()) != -1)
				System.out.println((char)content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
