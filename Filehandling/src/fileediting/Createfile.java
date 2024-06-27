package fileediting;
import java.io.IOException;
import java.io.File;
public class Createfile {
	public static void main(String[]args) {
		try {
			File obj=new File("C:\\sample\\sample.text");
			if(obj.createNewFile()) {
				System.out.println("new fie created:"+obj.getName());
			}else {
				System.out.println("file already complete");	
			}	
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}

}
