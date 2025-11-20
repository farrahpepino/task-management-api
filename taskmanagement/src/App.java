
import api.controllers.TaskController;
import api.repositories.ITaskRepository;
import api.repositories.TaskRepository;
import api.services.ITaskService;
import api.services.TaskService;

public class App {
    public static void main(String[] args) throws Exception {

        ITaskRepository repo = new TaskRepository();
        ITaskService service = new TaskService(repo);
        TaskController controller = new TaskController(service);

        controller.createTask(1, "Learn Java", "Practice backend architecture");
        controller.createTask(2, "Build API", "Make task manager");
        controller.createTask(3, "Test API", "Test application");

        System.out.println(controller.getTasks().toString());
        System.out.println(controller.getTaskById(3).toString());
        controller.deleteTaskById(3);
        System.out.println(controller.getTasks().toString());

    }
}
