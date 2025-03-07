package practice_2.creational.singleton.after;

/*
 * Давайте преобразуем DatabaseConfig в одиночку, применив паттерн синглтон.
 */
public class DatabaseConfig {
    public String config = "Default Config";
    private static DatabaseConfig instance;

    private DatabaseConfig() {}

    public static DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public void displayConfig() {
        System.out.println(config);
    }
}
