package patterns.creational.singleton.example;

/**
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 */
public class NotLazySingleton {

    public static final NotLazySingleton INSTANCE = new NotLazySingleton();

    private NotLazySingleton() {
    }

    public static NotLazySingleton getInstance() {
        return INSTANCE;
    }
}
