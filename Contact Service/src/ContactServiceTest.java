import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		
		Contact contact = new
				Contact("1234567891", "Ryan", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow");
		assertEquals(true, contactService.addContact(contact));
	}
	
	@Test
	void testRemoveContact() throws Exception {
		ContactService contactService = new ContactService();
		
		Contact contact = new Contact ( "123456789", "Reynolds", "Reynolds", "1234567889", "92556 noreal Rd Summerhallow"); 
		Contact contact1 = new Contact("1234567894", "Ryan", "Reynolds", "1234567889","92556 noreal Rd Summerhallow");
		Contact contact2 = new Contact("1234567891", "thee", "Reynold", "1234567889", "92556 noreal Rd Summerhallow");
		Contact contact3 = new Contact("8787678878", "Willow", "Glasses", "1235465996","24678 notreal Rd winerhallow");
		Contact contact4 = new Contact("2394958437", "Jeffry", "Batch", "8483929338","23456 stillno Rd winterfest");
		
		assertEquals(false, contactService.removeContact("123456789"));
		assertEquals(false, contactService.removeContact("242342343"));
		assertEquals(false, contactService.removeContact("424234234"));		
	}
	@Test
	void testUpdateContact() {
		ContactService contactService = new ContactService();
		
		Contact contact1 = new 
				Contact("1234567891", "Ryan", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow");
		Contact contact2 = new
				Contact("1234567891", "thee", "Reynold", "1234567889",
				"92556 noreal Rd Summerhallow");
		Contact contact3 = new
				Contact("8787678878", "Willow", "Glasses", "1235465996",
				"24678 notreal Rd winerhallow");
		Contact contact4 = new
				Contact("2394958437", "Jeffry", "Batch", "8483929338",
				"23456 stillno Rd winterfest");
		
		contactService.addContact(contact1);
		contactService.addContact(contact2);
		contactService.addContact(contact3);
		contactService.addContact(contact4);
		
	}

}
