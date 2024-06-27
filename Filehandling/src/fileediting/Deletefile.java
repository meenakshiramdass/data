package fileediting;
import java.io.File;

public class Deletefile {
	public static void main(String[]args) {
		File obj=new File("C:\\sample\\sample.text");
		if(obj.delete()) {
			System.out.println("File deleted");
		}else {
			System.out.println("error occured");
		}
		
	}

}
