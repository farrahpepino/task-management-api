package api.repositories;

import api.models.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository implements  ITaskRepository {
    private final List<Task> tasks = new ArrayList<>(); //study why i can do final

    @Override
    public void save(Task task){
        tasks.add(task);
    }

    @Override
    public List<Task> GetTasks(){
        return tasks;
    }

    @Override
    public Task getTaskById(int id){
        return tasks.stream()
        .filter(t -> t.getId() == id)
        .findFirst()
        .orElse(null);    
    }

    @Override
    public void deleteTaskById(int id){
        tasks.remove(getTaskById(id));
    }
}
