package creational.dependency_injection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import patterns.creational.dependency_injection.example.my.Holiday;
import patterns.creational.dependency_injection.example.my.service.ActFirstService;
import patterns.creational.dependency_injection.example.my.service.ActSecondService;
import patterns.creational.dependency_injection.example.my.service.impl.Bird;
import patterns.creational.dependency_injection.example.my.service.impl.Cat;
import patterns.creational.dependency_injection.example.my.service.impl.Human;

@Slf4j
public class MyExampleTest {

    @Test
    void holidayParty() {
        //todo enable log in test
        log.info("Hi");
        ActFirstService actFirstService = new ActFirstService(new Human());
        ActFirstService actFirstService2 = new ActFirstService(new Bird());
        ActSecondService actSecondService = new ActSecondService();
        actSecondService.setSinger(new Cat());
        Holiday holiday = new Holiday(actFirstService, actFirstService2, actSecondService);

        holiday.party();
    }
}
