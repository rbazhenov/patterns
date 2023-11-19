package patterns.creational.dependency_injection.example.my;

import lombok.extern.slf4j.Slf4j;
import patterns.creational.dependency_injection.example.my.service.ActFirstService;
import patterns.creational.dependency_injection.example.my.service.ActSecondService;

@Slf4j
public class Holiday {
    private final ActFirstService actFirstService;
    private final ActFirstService actFirstService2;
    private final ActSecondService actSecondService;

    public Holiday(ActFirstService actFirstService, ActFirstService actFirstService2, ActSecondService actSecondService) {
        this.actFirstService = actFirstService;
        this.actFirstService2 = actFirstService2;
        this.actSecondService = actSecondService;
    }

    public void party() {
        startParty();

        log.info("Party is end");
        System.out.println("Party is end");
    }

    private void startParty() {
        log.info("Party is starting");
        System.out.println("Party is starting");

        actFirstService.start();
        actFirstService2.start();
        actSecondService.start();
    }
}
