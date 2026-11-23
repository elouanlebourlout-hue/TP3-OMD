package fr.esir.omd.ci;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskManager {
    private List<Task> tasks;
    private static final Logger logger = LoggerFactory.getLogger(TaskManager.class);

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        logger.info("Nouvelle tache ajoutee {}", task.getTitle());
    }

    public List<Task> getTasks() {
        logger.debug("Recuperation de la liste des {} taches", tasks.size());
        return tasks;
    }
}