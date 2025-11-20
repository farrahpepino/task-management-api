package api.services;

import api.models.Task;
import api.repositories.ITaskRepository;
import java.util.List;

public class TaskService implements ITaskService {
private final ITaskRepository repository;
    
    public TaskService(ITaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Task task){
        repository.save(task);
    }

    @Override
    public List<Task> GetTasks(){
        return repository.GetTasks();
    }

    @Override
    public Task getTaskById(int id){
       return repository.getTaskById(id);
    }

    @Override
    public void deleteTaskById(int id){
        repository.deleteTaskById(id);
    }
}
