import java.util.*;

public class Appointment {
	private String appID;
	private Date appDate;
	private String desc;
	
	
	Appointment(String appID, Date appDate,  String desc){
		Date today = new Date(2022, Calendar.OCTOBER, 10);
		//invalid if statements if object doesn't reach requirements
		if (appID == null || appID.length()>10){
			throw new IllegalArgumentException("Invalid ID, must be less than 10 characters");
		}
		if (appDate == null){
				throw new IllegalArgumentException("Invalid Date");
			}
		else if(appDate.before(today)){
			throw new IllegalArgumentException("Invalid Date");
		}
		if (desc == null || desc.length() > 50){
			throw new IllegalArgumentException("Invalid description");
		}
	}
	
	//get
		public String getAppID(){
			return this.appID;
		}
		public Date getAppDate() {
			return this.appDate;
		}
		public String getdesc() {
			return this.desc;
		}
		
	//set
		//setters
		public void setAppID(String appID) {
			if(appID == null || appID.length()>10) {
				throw new IllegalArgumentException("Invalid ID, must be less than 10 characters");
			}
			else {
				this.appID = appID;
			}
		}
		public void setAppDate(Date appDate) {
			Date today = new Date();
			if (appDate == null){
				throw new IllegalArgumentException("Invalid Date");
			}
		else if(appDate.before(today)){
			throw new IllegalArgumentException("Invalid Date");
		}
		else {
			this.appDate = appDate;
		}
		}
		
		public void setDesc(String desc) {
			if (desc == null || desc.length()>50){
				throw new IllegalArgumentException("Invalid Description");
			}else {
			this.desc = desc;
		}
		}
		
}
