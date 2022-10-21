
public class Task {
	private String taskID;
	private String name;
	private String desc;
	
	
	
	Task(String taskID, String name, String desc){
		setTaskID(taskID);
		setName(name);
		setDesc(desc);
	}
	
	//get
	public final String getTaskID() {
		return taskID;
	}
	
	public final String getName() {
		return name;
	}
	
	public final String getDesc() {
		return desc;
	}
	
	//set
	
	public void setDesc(String desc) {
		if (desc == null ||desc.length() > 50) {
			throw new IllegalArgumentException("error");
		}
		else {
			this.desc = desc;
		}
	}
	
	
	public void setName(String name) {
		if (name == null ||name.length() > 20) {
			throw new IllegalArgumentException("error");
		}
		else {
			this.name = name;
		}
	}
	
	public void setTaskID(String taskID) {
		if (taskID == null ||taskID.length() > 10) {
			throw new IllegalArgumentException("error");
		}
		else {
			this.taskID = taskID;
		}
			
	}
	}

