import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
	private Date date = new Date(2025, Calendar.AUGUST, 29);
	
	@Test
	void testAddAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		
		Appointment appointment = new Appointment( "1234560", date,
						"a description");
		assertEquals(true, appointmentService.addApp(appointment));
	}
	
	@Test
	void testRemoveApp() throws Exception {
		AppointmentService appointmentService = new AppointmentService();
		
		Appointment app = new Appointment ( "123456789", date, "a descpriton"); 
		Appointment app1 = new Appointment("1234567894", date, "another desc");
		Appointment app2 = new Appointment("1234567891", date, "anther another desc");
		Appointment app3 = new Appointment("8787678878", date, "another another another desc");
		Appointment app4 = new Appointment("2394958437", date, "last description");
		
		assertEquals(false, appointmentService.removeApp("123456789"));
		assertEquals(false, appointmentService.removeApp("242342343"));
		assertEquals(false, appointmentService.removeApp("424234234"));		
	}
}
