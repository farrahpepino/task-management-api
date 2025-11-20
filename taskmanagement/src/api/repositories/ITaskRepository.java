package api.repositories;

import api.models.Task;
import java.util.List;

public interface ITaskRepository{
    void save(Task task);
    List<Task> GetTasks();
    Task getTaskById(int id);
    void deleteTaskById(int id);
}
