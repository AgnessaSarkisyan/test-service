package com.test.service.service;

import com.test.service.entity.Counter;

public interface CounterService {
    Counter getCounter();

    Counter incrementCounter();

    Counter resetCounter();
}