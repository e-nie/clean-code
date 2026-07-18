package practice_1.task_1.after_mine;


class Project {
    private UserRepository userRepository;
    private TaskRepository taskRepository;

    public Project(UserRepository userRepository, TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    public void assignTaskToUser(String title, String username) {
        Task task = taskRepository.findTask(title);
        task.setUser(userRepository.findUser(username));
        System.out.println("Task " + title + " assigned to " + username);
    }


    public void completeTask(String title) {
        Task task = taskRepository.findTask(title);
        task.setCompleted(true);
        System.out.println("Task " + title + " is completed");


    }
}
