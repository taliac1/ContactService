import java.util.ArrayList;
import java.util.*;
import java.util.UUID;

public class TaskService {

	//start array
	private ArrayList<Task> taskList;
	
	public TaskService() {
		taskList = new ArrayList<>();
	}
	//create unique ID
	private String TaskID() {
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	//checks for ID
	private Task findTaskID(String taskID) throws Exception{
		int i = 0;
		while (i < taskList.size()) {
			if(taskID.equals(taskList.get(i).getTaskID())) {
				return taskList.get(i);
			}
			i++;
		}
		throw new Exception("error: Task ID N/A");
	}
	
	//create a Task
	public void addTask(String name, String desc) {
		Task task = new Task(TaskID(), name, desc);
		taskList.add(task);
	}
	
	public void removeTask(String taskID) throws Exception{
		taskList.remove(findTaskID(taskID));
	}
	//update name
		public void updateName(String taskID, String name) throws Exception{
			findTaskID(taskID).setName(name);
			}
	
	//update description
		public void updateDesc(String taskID, String desc) throws Exception{
			findTaskID(taskID).setDesc(desc);
			}
		
		public List<Task> getTaskList() {
			return taskList;
		}
				
		}
