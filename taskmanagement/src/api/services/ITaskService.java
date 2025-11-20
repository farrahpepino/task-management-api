package api.services;

import api.models.Task;
import java.util.List;

public interface ITaskService {
    void save(Task task);
    List<Task> GetTasks();
    Task getTaskById(int id);
    void deleteTaskById(int id);
}
