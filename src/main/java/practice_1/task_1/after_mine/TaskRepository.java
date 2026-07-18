package practice_1.task_1.after_mine;


import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<Task> tasks;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getTitle());
    }

    public Task findTask(String title) {
        Task result =  tasks.stream().filter(t -> t.getTitle().equals(title)).findFirst().get();
        System.out.println("Task found: " + result.getTitle());
        return result;
    }
}
