import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {


			
	//test contact ID
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
			()->{ 
				new Contact( "12345678910", "Ryan", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow"); 
				});
	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
			()->{ 
				new Contact( null, "Ryan", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow"); 
				});
	}
	
	//test first name
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
			()->{ 
				new Contact( "12345678910", "Reynoldsreynolds", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow"); 
				});
	}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
			()->{ 
				new Contact( "12345678910", null, "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow"); 
				});
	}
	
	@Test
	void testFirstNameUpdate() throws Exception{
		Contact contact = new Contact ( "123456789", "Reynolds", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow"); 
			contact.updateFirstName("frank");
			assertAll(
					"first name",
					()
					-> assertEquals("frank", contact.getFirstName()),
					()
					-> assertThrows(IllegalArgumentException.class, 
							()-> contact.updateFirstName(null)),
					()
					-> assertThrows(IllegalArgumentException.class, 
							()-> contact.updateFirstName("reynoldsreynods"))
					);
			
	}
	
	//test last name
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				()->{ 
					new Contact( "12345678910", "Reynolds", "Reynoldsreynolds", "1234567889",
					"92556 noreal Rd Summerhallow"); 
					});
}
	@Test
	void testLasttNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, 
			()->{ 
				new Contact( "12345678910", "Reynoldsreynolds", null, "1234567889",
				"92556 noreal Rd Summerhallow"); 
				});
	}
	
	@Test
	void testLastNameUpdate() throws Exception{
		Contact contact = new Contact ( "123456789", "Reynolds", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow"); 
			contact.updateLastName("Rosevel");
			assertAll(
					"last name",
					()
					-> assertEquals("Rosevel", contact.getLastName()),
					()
					-> assertThrows(IllegalArgumentException.class, 
							()-> contact.updateLastName(null)),
					()
					-> assertThrows(IllegalArgumentException.class, 
							()-> contact.updateLastName("RosevelRosevel"))
					);
			
	}
	
	
	//test phone
	@Test
		void testPhoneTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class, 
				()->{ 
					new Contact( "12345678910", "Reynolds", "Reynolds", "1234544467889",
					"92556 noreal Rd Summerhallow"); 
					});
	}
	@Test
		void testPhoneNull() {
			Assertions.assertThrows(IllegalArgumentException.class, 
				()->{ 
					new Contact( "12345678910", "Reynolds", "Reynolds", null,
					"92556 noreal Rd Summerhallow"); 
					});
		}
	
	@Test
	void testPhoneUpdate(){
		Contact contact = new Contact ( "123456789", "Reynolds", "Reynolds", "1234567889",
				"92556 noreal Rd Summerhallow"); 
			contact.updatePhone ("1234567888");
			assertAll(
					"phone number",
					()
					-> assertEquals("1234567888", contact.getPhone()),
					()
					-> assertThrows(IllegalArgumentException.class, 
							()-> contact.updatePhone(null)),
					()
					-> assertThrows(IllegalArgumentException.class, 
							()-> contact.updatePhone("123456789"))
					);
			
	}
	
	//test address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
			()->{ 
				new Contact( "12345678910", "Reynolds", "Reynolds", "1234544467889",
				"92556 noreal Rd Summerhallowssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss"); 
				});
	}
		
		@Test
		void testAddressNull() {
			Assertions.assertThrows(IllegalArgumentException.class, 
				()->{ 
					new Contact( "12345678910", "Reynolds", "Reynolds", "1234544467889",
					null); 
					});
		}
		@Test
		void testAddressUpdate(){
			Contact contact = new Contact ( "123456789", "Reynolds", "Reynolds", "1234567889",
					"92556 noreal Rd Summerhallow"); 
				contact.updateAddress ("4556 stillnoreal St Winter");
				assertAll(
						"address",
						()
						-> assertEquals("4556 stillnoreal St Winter", contact.getAddress()),
						()
						-> assertThrows(IllegalArgumentException.class, 
								()-> contact.updateAddress(null)),
						()
						-> assertThrows(IllegalArgumentException.class, 
								()-> contact.updateAddress("4556 stillnoreal St Winterhallow4556 stillnoreal St Winterhallow4556 stillnoreal St Winterhallow4556 stillnoreal St Winterhallow4556 stillnoreal St Winterhallow4556 stillnoreal St Winterhallow4556 stillnoreal St Winterhallow"))
						);
				
		}
		
}
