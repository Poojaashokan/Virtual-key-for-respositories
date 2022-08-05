package iostreams;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Displayfileex {

	public void display(String path) {
		
		File file=new File(path);
		if(file.isDirectory()){
			
			List<String> FilesList = Arrays.asList(file.list());
		    Collections.sort(FilesList);
		
		    for(String s:FilesList)
		    	System.out.println(s);
		}
		else
			System.out.println(file.getAbsolutePath() + " is not a directory");
}
}
