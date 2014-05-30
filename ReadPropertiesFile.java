package com.ifeng.Action;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 读取配置文件的例子
 * @author zhangyj
 *
 */
public class test {
	public static void main(String[] args) {
		//System.out.println(System.getProperty("user.dir"));
		loadFile();
	}
	
	private static void loadFile() {
		String filePath = System.getProperty("user.dir")+"/conf/shield.properties";
		BufferedReader bufr = null;
		String line = null;
		try {
			bufr = new BufferedReader(new FileReader(filePath));
			while((line=bufr.readLine())!= null){
				parceLine(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(bufr != null){
					bufr.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

	private static void parceLine(String line) {
		String str = line;
		String tmp = str.trim();
		
		if(tmp.startsWith("#") || tmp.isEmpty()) {
			return;
		}
		String[] value = tmp.split("=", 2);
		System.out.println(value[0]+"="+value[1]);
	}
}
