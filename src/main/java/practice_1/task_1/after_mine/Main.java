package practice_1.task_1.after_mine;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Kolja", "kolja@yahoo.com"));
        users.add(new User("Vasja", "vasja@yahoo.com"));

        UserRepository userRepository = new UserRepository(users);
        TaskRepository taskRepository = new TaskRepository();

        Project project = new Project(userRepository, taskRepository);

        project.addTask(new Task("Clean the floor", "Very thoroughly",new Date()));
        project.assignTaskToUser("Clean the floor", "Kolja");
        project.completeTask("Clean the floor");

    }


}
