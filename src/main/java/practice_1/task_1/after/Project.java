package practice_1.task_1.after;

class Project {
    private UserResository userResository;
    private TaskRepository taskRepository;

    public Project(UserResository userResository, TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
        this.userResository = userResository;
    }

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    public void assignTaskToUser(String title, String username) {
        Task task = taskRepository.findTask(title);
        task.setUser(userResository.findUser(username));
        System.out.println("Task " + title + " was assign to " + username);
    }

    public void completeTask(String title) {
        Task task = taskRepository.findTask(title);
        task.setCompleted(true);
        System.out.println("Task " + title + " was completed");
    }
}
