package fr.esir.omd.ci;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskManagerTest {

    @Test
    public void testAddAndGetTasks() {
        TaskManager manager = new TaskManager();
        Task task = new Task("Tâche test", "Description test", false);

        manager.addTask(task);
        List<Task> tasks = manager.getTasks();

        assertEquals(1, tasks.size());
        assertEquals("Tâche test", tasks.get(0).getTitle());
    }
}