package patterns.creational.dependency_injection.example.my.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActSecondService {
    private Singable singer;

    public void setSinger(Singable singer) {
        log.debug("Setter injection");
        this.singer = singer;
    }

    public void start() {
        if (singer == null) {
            log.error("Singer is null");
            System.out.println("ActSecondService: Singer is null");
        }

        log.debug("Act is starting");
        singer.sing();
    }
}
