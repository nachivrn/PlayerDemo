package com.playersDemo.resources;

import com.playersDemo.domain.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleepController {

    private final Logger log =
            LoggerFactory.getLogger(this.getClass());

    @PostMapping("/api/sleep")
    @ResponseStatus(value = HttpStatus.OK, code = HttpStatus.OK)
    public void sleepForDuration(@RequestBody Duration duration) {
        try {
            long timeToSleep = duration.getDuration() * 1000;
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
           log.info("ThreadInterruption -> {}", e.getMessage());
        }
        log.info("Finished sleeping for duration {} seconds",
                duration.getDuration());
    }

}
