package Lists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GetPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("G:\\Prog\\arraylist.txt");
			int i;
			while((i = fileInputStream.read()) != -1)
			{
				System.out.print((char)i);
			}
			
			
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	List l = new ArrayList();
	 l.toArray();
		
		
		
		
	}

}
