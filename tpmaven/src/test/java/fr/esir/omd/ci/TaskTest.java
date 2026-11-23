package fr.esir.omd.ci;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskTest {

    @Test
    public void testTask() {
        Task task = new Task("Titre", "Description", false);

        assertEquals("Titre", task.getTitle());
        assertEquals("Description", task.getDescription());
        assertFalse(task.isCompleted());

        task.setTitle("Nouveau titre");
        task.setDescription_("Nouvelle description");
        task.setCompleted(true);

        assertEquals("Nouveau titre", task.getTitle());
        assertEquals("Nouvelle description", task.getDescription());
        assertTrue(task.isCompleted());
    }
}