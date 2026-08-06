package practice_2.creational.singleton.after_mine;

public class Main {
    public static void main(String[] args) {
        //есть возможность вызвать конструктор
        //нет возможности вызывать конструктор
        DatabaseConfig config1 = DatabaseConfig.getInstance();
        DatabaseConfig config2 = DatabaseConfig.getInstance();

        config1.config = "DB Config for User A";
        config2.config = "DB Config for User B";

        config1.displayConfig(); // Выводит "DB Config for User A"
        config2.displayConfig(); // Выводит "DB Config for User B"
    }
}
