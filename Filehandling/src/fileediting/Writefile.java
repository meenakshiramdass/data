package fileediting;
import java.io.FileWriter;
import java.io.IOException;
public class Writefile {
	public static void main(String[]args) {
		try {
			FileWriter obj=new FileWriter("C:\\sample\\sample");
			obj.write("hello world");
			obj.close();
			System.out.println("File Writing success");
		}
	catch(IOException e) {
		System.out.println("Error occured");
	}
	}

}
