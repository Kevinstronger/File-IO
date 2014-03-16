package com.test;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			/**
			 * public FileWriter(String fileName,
                  boolean append)
           throws IOException根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。 

			参数：
			fileName - 一个字符串，表示与系统有关的文件名。
			append - 一个 boolean 值，如果为 true，则将数据写入文件末尾处，而不是写入文件开始处。 
			抛出： 
			IOException - 如果指定文件存在，但它是一个目录，而不是一个常规文件；或者该文件不存在，但无法创建它；
			抑或因为其他某些原因而无法打开它

			 */
			fw = new FileWriter("F:/append.txt", true);
			//在Windows中，\r\n一起使用表示回车符
			fw.write("Nice to meet you \r\nGoodBye!!");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
