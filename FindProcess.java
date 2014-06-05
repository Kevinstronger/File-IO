import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SearchPro {
	public static void main(String[] args) {
		System.out.println(findProcess("notepad.exe"));
	}
	private static boolean findProcess(String processName) {
		BufferedReader bufr = null;
		try {
			Process process = Runtime.getRuntime().exec("tasklist /FI \"IMAGENAME eq "+processName+"\" ");
			bufr = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			while ((line = bufr.readLine()) != null) {
				if(line.contains(processName)){
					return true;
				}
			}
			System.out.println("没有该进程");
			return false;
		} catch (IOException e) {
			throw new RuntimeException("书写的WINDOWS命令有误" + e);
		}finally{
			try{
				if(bufr != null){
					bufr.close();
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
		
}
