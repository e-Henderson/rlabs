package testsPackage;

import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\ethen\\OneDrive\\Desktop\\JSpring\\Tests\\src\\testsPackage\\data";
		FileReader fr = null;//instantiated outside to be able to access outside of try block
		
		try {
			fr = new FileReader(fileName);//making a local variable
			int i;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
