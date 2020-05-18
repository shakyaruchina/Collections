package mapTypes;

import java.io.File;
import java.io.FilenameFilter;

public class ReadingAndQueueJpegImage {

	public static void main(String[] args) {
		File file = new File("File Path");
		File[] files = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//condition for jpegfile
				if(name.toLowerCase().endsWith(".jpeg")) {
					//file size
					double bytes = file.length();
					double kilobytes =(bytes/1024);
					//MB
					double megabytes = (kilobytes/1024);
					//applying the condition MB >1
					if(megabytes> 1 ) {
						return true;
					}
					return true;
				}else {
					return false;
				}
			}
		});
		
		for(File f:files) {
			System.out.println(f.getName());
		}

	}

}
