import java.util.*;

public class ContactService {
	
	//start array
	private ArrayList<Contact> contactList;
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	//create a contact
	public boolean addContact(Contact contact) {
		boolean contactThere = false;
		for (Contact list:contactList) {
			if (list.equals(contact)){
				contactThere = true;
			}
		}
		if (!contactThere) {
			contactList.add(contact);
				return true;
			}
			else {
				return false;
			}
	}
	
	public boolean removeContact(String contactID) {
		for (Contact list:contactList) {
			if (list.getContactID().equals(contactID)) {
				contactList.remove(list);
				return true;
			}
		}
		return false;
	}
	}
