package com.playersDemo.ratelimit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.Semaphore;

@Component
public class SimpleRateLimiter {
    private Semaphore semaphore;

    public SimpleRateLimiter(@Value("${ratelimit.permits}") int permits) {
        semaphore = new Semaphore(permits);
    }

    public boolean tryAcquire() {
        return semaphore.tryAcquire();
    }

    public void release() {
        semaphore.release();
    }


}
