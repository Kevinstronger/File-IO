package com.test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			//demo.txt的内容为abc
			fr = new FileReader("F:/demo.txt");
			/**
			 * public int read()
         			throws IOException读取单个字符。

					返回：
					作为整数读取的字符，范围在 0 到 65535 之间 (0x00-0xffff)，如果已到达流的末尾，则返回 -1 
					抛出： 
					IOException - 如果发生 I/O 错误
			 */
			int readres = fr.read();
			//读取第一个字母a,该字母对应的数字为97
			System.out.println(readres);//打印的结果为97
			//将返回的int类型的结果转成char类型，显示为read=a
			System.out.println("read=" + (char)readres);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
