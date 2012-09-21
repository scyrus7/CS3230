import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Person extends Address 
{
	private String Fname;
	private String Lname;
	private String Dob;
	
	public Person(String a, String c, String s, String zc, String pn, String fn, String ln)
	{
		super(a, c, s, zc, pn);
		// TODO Auto-generated constructor stub
		Fname = fn;
		Lname = ln;
		
	}
	
	public Person(String Address, String City, String State, String ZipCode, String PhoneNumber, String Fname, String Lname, String dob)
	{
		super(Address, City, State, ZipCode, PhoneNumber);
		this.Fname = Fname;
		this.Lname = Lname;
		Dob = dob;			
	}
	

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
		
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}
	
	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String toString()
	{
		return "Address : \n" + this.getAddress() +" City: \n" + this.getCity() +" State: \n" + this.getState();
	}

}
