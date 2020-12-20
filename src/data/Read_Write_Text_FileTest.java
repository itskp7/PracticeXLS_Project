package data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_Text_FileTest {

	public static void main(String[] args) throws IOException {
		
		// For creating a text file
		File krunal = new File("C:\\testing\\TempPracticeFile.txt");  
		krunal.createNewFile();                                       // now the file is created into the folder
		
		// Now for writing into the text file // there is a inbuilt class in java called FileWriter and BufferedWriter 
		// so we have to create its object first
		
		FileWriter w = new FileWriter("C:\\testing\\TempPracticeFile.txt");
		w.write("hello we are writing in a file\n");
		w.write("\nThis is a new line 1\n");
		w.write("This is a new line 2\n");
		w.write("This is a new line 3\n");
		w.write("This is a new line 4\n");
		w.flush();
		 
		
		

	}

}
