/**
 * 
 */

/**
 * @author Sam
 *
 */
 abstract class Address {
	
	
	private String Address;
	private String City;
	private String State;
	private String ZipCode;
	private String PhoneNumber;
	
	
	//constructor
	public Address(String a, String c, String s, String zc, String pn)
	{
	
		Address = a;
		City = c;
		State = s;
		ZipCode = zc;
		PhoneNumber = pn;
		
	}
	
	
	// setters & getters 
	
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
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	
	public abstract String getInfo();
	

}
