package api.controllers;

import api.models.Task;
import api.services.ITaskService;
import java.util.List;

public class TaskController {
    private final ITaskService service;
    public  TaskController(ITaskService service){
        this.service = service; 
    }

    public void createTask(int id, String title, String description) {
        Task task = new Task(id, title, description);
        service.save(task);
    }

    public List<Task> getTasks(){
        return service.GetTasks();
    }

    public Task getTaskById(int id){
       return service.getTaskById(id);
    }

    public void deleteTaskById(int id){
        service.deleteTaskById(id);
    }
}
