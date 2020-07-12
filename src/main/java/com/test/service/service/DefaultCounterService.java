package com.test.service.service;

import com.test.service.entity.Counter;
import com.test.service.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultCounterService implements CounterService{

    private final CounterRepository counterRepository;

    @Autowired
    public DefaultCounterService(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }


    @Override
    public Counter getCounter() {
        return counterRepository.getCounterByName("webservice");
    }

    @Override
    public Counter incrementCounter() {
        return counterRepository.incrementCounter("webservice");
    }

    @Override
    public Counter resetCounter() {
        return counterRepository.resetCounter("webservice");
    }
}
