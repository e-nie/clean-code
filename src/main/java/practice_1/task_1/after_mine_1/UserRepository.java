package practice_1.task_1.after_mine_1;

import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }


    public void addUser(User user) {
        users.add(user);
    }

    public User findUser(String username) {
        User result = users.stream().filter(u -> u.getUsername().equals(username)).findFirst().get();
        System.out.println("User " + username + " is found");
        return result;
    }

}
