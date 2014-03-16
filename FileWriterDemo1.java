package com.exec.string;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo1 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			//创建一个FileWriter对象，该对象一被初始化就必须要明确被操作的文件
			fw = new FileWriter("F:/demo.txt");
			
			//调用writer()方法，将字符串写入到内存中的流里
			 fw.write("Hello World!");
			 
			 //刷新流对象中的缓冲中的数据
			 //将数据刷到目的地中
			 //fw.flush();
		}catch(IOException e){
			System.out.println(e.toString());
		}finally{
			//关闭流资源，但是关闭之前会刷新一次内部的缓冲流中的数据
			 //将数据刷到目的地中
			 //和flush的区别，flush刷新后，流可以继续使用，close刷新后，会将流关闭
			 try {
				 if(fw != null)
					 fw.close();
			 }catch(IOException e){
				 System.out.println(e.toString());
			 }
		}
	}
}
