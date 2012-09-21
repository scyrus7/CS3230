
public class AddressBookItem extends Person {

	
		// TODO Auto-generated constructor stub
	public AddressBookItem(String Address, String City, String State,
			String ZipCode, String PhoneNumber, String Fname, String Lname,
			String dob)
	{
		super(Address, City, State, ZipCode, PhoneNumber, Fname, Lname, dob);
		// TODO Auto-generated constructor stub
	}
	

	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
				
	}
	
	public String toString()
	{
		return ("Name:"+this.getFname() +"Last name: \n"+ this.getLname()+ "Date of Birth: \n" +this.getDob()+
				"Phone number: \n"+this.getPhoneNumber());
	}

	

}
