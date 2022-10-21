
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	Contact(String contactID, String firstName, String lastName, String phone, String address){
		
		//invalid if statements if object doesn't reach requirements
		if (contactID == null || contactID.length()>10){
			throw new IllegalArgumentException("Invalid ID, must be less than 10 characters");
		}
		if (firstName == null || firstName.length() > 10){
				throw new IllegalArgumentException("Invalid Name, must be less than 10 characters");
			}
		if (lastName == null || lastName.length() > 10){
			throw new IllegalArgumentException("Invalid Last Name, must be less than 10 characters");
		}
		if (phone == null || phone.length() != 10){
			throw new IllegalArgumentException("Invalid phone number, must be exactly 10 characters");
		}
		if (address == null || address.length() > 30){
			throw new IllegalArgumentException("Invalid address, must be less than 30 characters");
		}
	}
	
	//set get
	public String getContactID(){
		return this.contactID;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getAddress(){
		return this.address;
	}
	
	//setters
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	public void setFirstName(String firstName) {
		this.contactID = firstName;
	}
	public void setLastName(String lastName) {
		this.contactID = lastName;
	}
	public void setPhone(String phone) {
		this.contactID = phone;
	}
	public void setAddress(String address) {
		this.contactID = address;
	}
	
	//update first name
	public void updateFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("Invalid Name");
		}
		else if (firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid Name, must be less than 10 characters");
		}
		else {
			this.firstName = firstName;
		}
			
	}
	
	//update last name
	public void updateLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("Invalid Name");
		}
		else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Name, must be less than 10 characters");
		}
		else {
			this.lastName = lastName;
		}
			
	}
	
	//update phone
	public void updatePhone(String phone) {
		if (phone == null) {
			throw new IllegalArgumentException("Invalid Phone number");
		}
		else if (phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone number, must be exactly 10 characters");
		}
		else {
			this.phone = phone;
		}
			
	}
	
	//update address
	public void updateAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Invalid address");
		}
		else if (address.length() > 30 ) {
			throw new IllegalArgumentException("Invalid address, must be less than 30 characters");
		}
		else {
			this.address = address;
		}
			
	}
	
}
