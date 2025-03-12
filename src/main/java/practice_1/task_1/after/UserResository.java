package practice_1.task_1.after;

import java.util.List;

public class UserResository {
    private List<User> users;

    public UserResository(List<User> users) {
        this.users = users;
    }

    public User findUser(String username) {
        System.out.println("We are trying to find user: " + username);
        return users.stream().filter(it -> it.getUsername().equals(username)).findFirst().get();
    }
}
