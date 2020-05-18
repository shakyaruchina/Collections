package mapTypes;

import java.io.File;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingByMethod {

	public static void main(String[] args) {
		File file = new File("/Users/ruchina/Desktop/Form/");
		System.out.println("RANDOM PRINTING OF THE FILES: ");
		
		
		if(file.isDirectory()) {
			List<String> listF = Arrays.asList(file.list());
			System.out.println();
			for(String s:listF) {
				System.out.println(s);
			}
			System.out.println();
			//sort method
			//normal order-ascending order
			Collections.sort(listF);
			System.out.println("FILENAME IN ASCENDING ORDER: ");
			System.out.println();
			
			//for loop to list the filenames
			for(String s:listF) {
				System.out.println(s);
			}
			System.out.println();
			System.out.println("FILENAME IN DESCENDING ORDER: ");
			
			//reverseorder to arrange it in descending order
			Collections.sort(listF,Collections.reverseOrder());
			System.out.println();
			
			for(String s:listF) {
				System.out.println(s);
			}
		}
		else {
			System.out.println(file.getAbsolutePath());
		}

	}

}
