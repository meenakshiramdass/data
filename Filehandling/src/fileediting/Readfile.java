package fileediting;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {
	public static void main(String[]args) {
		try {
			File obj=new File("C:\\sample\\sample");
			Scanner reader=new Scanner(obj);
			while(reader.hasNextLine()) {
			String data=reader.nextLine();
			 
			System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("error occured");
		}
	}

}
