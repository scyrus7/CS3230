import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookItems {

	/**
	 * @param args3
	 * @author Sam
	 * CS3230
	 */
	public static void main(String[] args) 
	{		
		ArrayList<AddressBookItem> addressList = new ArrayList<AddressBookItem>();
		
		addressList.add(new AddressBookItem("1234 state st.","SLC", "UT", "12345", "801-888-000" , "jackson", "penny", "03/25/2002"));
		addressList.add(new AddressBookItem("1234 state st.","SLC", "UT", "12345", "801-888-000" , "jaci", "jack", "03/28/1980"));
		addressList.add(new AddressBookItem("1234 state st.","SLC", "UT", "12345", "801-888-000" , "jack", "smith", "03/25/2002"));
		addressList.add(new AddressBookItem("1234 state st.","SLC", "UT", "12345", "801-888-000" , "jaci", "sport", "03/28/1980"));
		addressList.add(new AddressBookItem("1234 state st.","SLC", "UT", "12345", "801-888-000" , "jack", "penny", "03/25/2002"));
		addressList.add(new AddressBookItem("1234 state st.","SLC", "UT", "12345", "801-888-000" , "jackson", "penny", "03/25/2002"));

		Scanner Keybd = new Scanner(System.in);
		
		System.out.print("Please enter the last name to search for or q to quit: ");
		String SearchName = Keybd.next().trim();
		
		if (SearchName.equals("q") == false)
		{
		    boolean found = false;
		    for(Person a: addressList)
		    {
		       if(a.getLname().equals(SearchName))
		       {
		    	   System.out.println("\nThe contact info is: ");
		           System.out.println("First name: " + a.getFname());
		           System.out.println("Last name: "+ a.getLname());
		           System.out.println("Address name: "+ a.getAddress());
		           System.out.println("City name: "+ a.getCity());
		           System.out.println("State name: "+ a.getState());
		           System.out.println("DOB name: "+ a.getDob());
		           System.out.println("Phone number: " + a.getPhoneNumber());
		           
		           found = true;
		           //break;
		       }

		    }
		       if(found == false)
		       { 
		          System.out.println("The Person you looking for Not Found!");
		       }

		}	
		
	}

}


