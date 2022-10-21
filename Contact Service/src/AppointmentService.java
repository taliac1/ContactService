import java.util.ArrayList;

public class AppointmentService {

	//start array
	private ArrayList<Appointment> appList;
	public AppointmentService() {
		appList = new ArrayList<>();
	}
	
	//create a contact
	public boolean addApp(Appointment appointment) {
		boolean appThere = false;
		for (Appointment list:appList) {
			if (list.equals(appointment)){
				appThere = true;
			}
		}
		if (!appThere) {
			appList.add(appointment);
				return true;
			}
			else {
				return false;
			}
	}
	
	public boolean removeApp(String appID) {
		for (Appointment list:appList) {
			if (list.getAppID().equals(appID)) {
				appList.remove(list);
				return true;
			}
		}
		return false;
	}
	
}
