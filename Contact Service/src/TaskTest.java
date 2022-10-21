import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
	private String ID, name, desc;
	private String longID, longName, longDesc;
	@BeforeEach
	void testSetUp(){
		ID = "184736293";
		name = "reynolds";
		desc = "descrition of task";
		longID = "347942378943278347847949234978329";
		longName = "making a really really long name";
		longDesc = "asdasasljdaskl yup making this super long super long so this project doesnt work cause an error is needed im adding so many characters.\";";
	}
	
	//test objects
	
	@Test
	void testGetTaskID(){
		Task task = new Task (ID, name, desc); 
			Assertions.assertEquals(ID, task.getTaskID());
	}
	@Test
	void testGetName(){
		Task task = new Task (ID, name, desc); 
			Assertions.assertEquals(name, task.getName());
	}
	@Test
	void testGetDesc(){
		Task task = new Task (ID, name, desc); 
			Assertions.assertEquals(desc, task.getDesc());
	}
	
	//test requirements
	
	@Test
	void testSetDesc(){
		Task task = new Task (ID, name, desc); 
			task.setDesc(desc);
			Assertions.assertEquals(desc, task.getDesc());
	}
	
	@Test
	void testSetName(){
		Task task = new Task (ID, name, desc); 
			task.setName(name);
			Assertions.assertEquals(name, task.getName());
	}
	
	@Test
	void testSetTaskID(){
		Task task = new Task (ID, name, desc); 
			task.setTaskID(ID);
			Assertions.assertEquals(ID, task.getTaskID());
	}

}
