package mapTypes;

import java.io.File;
import java.io.FilenameFilter;


public class CountingFiles {

	public static void main(String[] args) {
		
		File file = new File("/Users/ruchina/Desktop/Form");
		int Count = file.list().length;
		System.out.println("No. of files present: " + Count);
		
		String[] splitS = file.getName().split("/.");
		String extension = splitS[splitS.length-1];
		System.out.println(extension);
			
			

	}

}
