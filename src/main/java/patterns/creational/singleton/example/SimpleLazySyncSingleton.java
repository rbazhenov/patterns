package patterns.creational.singleton.example;

/**
 * + Ленивая инициализация
 * - Низкая производительность (критическая секция) в наиболее типичном доступе
 */
public class SimpleLazySyncSingleton {

    private static SimpleLazySyncSingleton instance;

    private SimpleLazySyncSingleton() {
    }

    public static synchronized SimpleLazySyncSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleLazySyncSingleton();
        }
        return instance;
    }
}
