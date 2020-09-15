package com.playersDemo.ratelimit;

import org.springframework.stereotype.Component;

import java.util.concurrent.Semaphore;

@Component
public class SimpleRateLimiter {
    private Semaphore semaphore;

    public SimpleRateLimiter() {
        semaphore = new Semaphore(5);
    }

    public boolean tryAcquire() {
        return semaphore.tryAcquire();
    }

    public void release() {
        semaphore.release();
    }


}
