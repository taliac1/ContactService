import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import java.util.Date;
import java.util.Calendar;

import org.junit.jupiter.api.Test;

class AppointmentTest {
	private Date today = new Date(2022, Calendar.OCTOBER, 10);
	private Date date = new Date(2025, Calendar.AUGUST, 29);
	private Date pastDate = new Date(2010, Calendar.AUGUST, 29);
	
	
	//test ID
	@Test
	void testAppointmentIDLong() {
		Assertions.assertThrows(IllegalArgumentException.class, 
				()->{ 
					new Appointment( "12345678910", date,
					"a description"); 
					});
	}
		@Test
		void testAppointmentNull() {
			Assertions.assertThrows(IllegalArgumentException.class, 
					()->{ 
						new Appointment( null, date,
						"a description"); 
						});
	}
	//test Date
		@Test
		void testAppointmentDatePast() {
			Assertions.assertThrows(IllegalArgumentException.class, 
					()->{ 
						new Appointment( "12345", pastDate,
						"a description"); 
						});
		}
			@Test
			void testDateNull() {
				Assertions.assertThrows(IllegalArgumentException.class, 
						()->{ 
							new Appointment( "123456", null,"a description"); 
							});
		}
		
	//test description
			@Test
			void testDescLong() {
				Assertions.assertThrows(IllegalArgumentException.class, 
						()->{ 
							new Appointment( "12345", date,
							"a description that is very very very very very veyr very very very very very long"); 
							});
			}
				@Test
				void testDescNull() {
					Assertions.assertThrows(IllegalArgumentException.class, 
							()->{ 
								new Appointment( "123456", date,null); 
								});
			}
}
