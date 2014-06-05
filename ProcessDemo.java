package com.ifeng.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessDemo {
	public static void main(String[] args) {
		BufferedReader bufr = null;
		try {
			Process process = Runtime.getRuntime().exec("tasklist");
			bufr = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			System.out.println("正在运行的进程有：");
			while((line = bufr.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(bufr != null){
					bufr.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	/**
	 * 最终的运行结果
	 	正在运行的进程有：

		映像名称                       PID 会话名              会话#       内存使用 
		========================= ======== ================ =========== ============
		System Idle Process              0 Services                   0         24 K
		System                           4 Services                   0        368 K
		smss.exe                       284 Services                   0      1,416 K
		csrss.exe                      372 Services                   0      6,936 K
	    
	 */
}
