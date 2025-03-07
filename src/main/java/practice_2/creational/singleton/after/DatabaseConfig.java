package practice_2.creational.singleton.after;

// Задача: трансформировать DatabaseConfig в единственный экземпляр конфига в программа
// с помощью паттерна одиночка
public class DatabaseConfig {
    public String config = "Default Config";
    // единственный экземпляр DatabaseConfig
    private static DatabaseConfig databaseConfig;

    // закрыли возможность вызывать конструктор
    private DatabaseConfig() {

    }

    // создание единственного экземпляра DatabaseConfig
    public static DatabaseConfig getInstance() {
        if (databaseConfig == null) {
            databaseConfig = new DatabaseConfig();
        }
        return databaseConfig;
    }

    public void displayConfig() {
        System.out.println(config);
    }
}
