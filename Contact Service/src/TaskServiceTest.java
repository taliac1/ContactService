import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {
	private String ID, name, desc;
	private String longID, longName, longDesc;
	@BeforeEach
	void testSetUp(){
		name = "reynolds";
		desc = "descrition of task";
		}

	@Test
	void testAddTask() {
		TaskService taskService = new TaskService();
		taskService.addTask(name, desc);
		Assertions.assertNotNull(taskService.getTaskList().get(0).getTaskID());
		Assertions.assertNotEquals("xxxx", taskService.getTaskList().get(0).getTaskID());
	}
	
	@Test
	void testAddDesc() {
		TaskService taskService = new TaskService();
		taskService.addTask(name, desc);
		Assertions.assertNotNull(taskService.getTaskList().get(0).getDesc());
		Assertions.assertNotEquals("xxxx", taskService.getTaskList().get(0).getDesc());
	}
	
	@Test
	void testRemoveTask() throws Exception {
		TaskService taskService = new TaskService();
		taskService.addTask(name, desc);
		assertEquals(1,taskService.getTaskList().size());	
		taskService.removeTask(taskService.getTaskList().get(0).getTaskID());
		assertEquals(0,taskService.getTaskList().size());
	}
	//test updates of desc and name
	@Test
	void testUpdateName() throws Exception {
		TaskService taskService = new TaskService();
		taskService.addTask(name, desc);
		taskService.updateName(taskService.getTaskList().get(0).getTaskID(), name);
		assertEquals(name, taskService.getTaskList().get(0).getName());
	}
	
	@Test
	void testUpdateDesc() throws Exception {
		TaskService taskService = new TaskService();
		taskService.addTask(name, desc);
		taskService.updateDesc(taskService.getTaskList().get(0).getTaskID(),"new description");
		assertEquals("new description", taskService.getTaskList().get(0).getDesc());
	}
	//assertThrows(Exception.class, () -> taskService.getTaskList().size());
	}
