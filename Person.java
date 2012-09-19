/**
 * 
 */

/**
 * @author Sam
 *
 */
public class Person {
	
	private String Name;
	private String Address;
	private String City;
	private String State;
	private String ZipCode;
	private char PhoneNumber;
	private char DateOfB;
	
	public Person(String n, String a, String c, String s, String zc, char pn, char db)
	{
		Name = n;
		Address = a;
		City = c;
		State = s;
		ZipCode = zc;
		PhoneNumber = pn;
		DateOfB = db;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public char getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(char phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public char getDateOfB() {
		return DateOfB;
	}
	public void setDateOfB(char dateOfB) {
		DateOfB = dateOfB;
	}
	
	
	

}
