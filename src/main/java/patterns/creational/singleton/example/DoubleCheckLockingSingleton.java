package patterns.creational.singleton.example;

/**
 * Double Checked Locking & volatile.
 * </p>
 * + Ленивая инициализация
 * + Высокая производительность
 */
public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton getInstance(){
        DoubleCheckLockingSingleton localInstance = instance;
        if (localInstance == null){
            synchronized (DoubleCheckLockingSingleton.class){
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return localInstance;
    }
}
