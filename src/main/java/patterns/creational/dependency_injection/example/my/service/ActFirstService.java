package patterns.creational.dependency_injection.example.my.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActFirstService {
    private final Singable singer;

    public ActFirstService(Singable singer) {
        log.debug("Constructor injection");
        this.singer = singer;
    }

    public void start() {
        log.debug("Act is starting");
        singer.sing();
    }
}
