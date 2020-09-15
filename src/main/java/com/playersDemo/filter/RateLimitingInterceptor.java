package com.playersDemo.filter;

import com.playersDemo.ratelimit.SimpleRateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RateLimitingInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private SimpleRateLimiter rateLimiter;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        boolean allowRequest = rateLimiter.tryAcquire();
        if (!allowRequest) {
            response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
        }
        return allowRequest;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        rateLimiter.release();
    }
}
