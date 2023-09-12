package creational.singleton;

import org.junit.jupiter.api.Test;
import patterns.creational.singleton.example.SimpleLazySyncSingleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleLazySyncSingletonTest {

    @Test
    public void testMultipleInstances() {
        SimpleLazySyncSingleton singleton1 = SimpleLazySyncSingleton.getInstance();
        SimpleLazySyncSingleton singleton2 = SimpleLazySyncSingleton.getInstance();
        assertEquals(singleton1, singleton2);
    }
}
