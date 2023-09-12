package creational.singleton;

import org.junit.jupiter.api.Test;
import patterns.creational.singleton.example.EnumSingleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumSingletonTest {

    @Test
    public void testMultipleInstances() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        assertEquals(instance1, instance2);
    }
}
