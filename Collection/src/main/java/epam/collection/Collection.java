package epam.collection;
import java.util.ArrayList;
public class Collection {
	public static void main(String args[]) 
	{
		ArrayList<String> h = new ArrayList<String>();
		
		h.add("America");
		h.add("India");
		h.add("Australia");
		h.add("Paris");
		h.add("Antartica");
		h.add("Maldives");
		h.add("Europe");
		h.add("Pakistan");
		h.add("Asia");
		h.add("Korea");
		
		System.out.println(h);
		h.remove("Australia");
		
		System.out.println("To check whether data is found in given list :");
		for(String s:h)
		{
			if(s.equals("Korea"))
			{
				System.out.println("Yes,Korea is present ");
			}
			
			
		}
		
		System.out.println("The data in list is:");
		for(String s:h)
		{
			System.out.println(s+" ");
			
		}
			
		
	}
	

}
