package com.test.service.repository;

import com.test.service.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Integer> {

    Counter getCounterByName(String name);

    default Counter incrementCounter(String name) {
        Counter counter = getCounterByName(name);
        counter.setValue(counter.getValue() + 1);
        save(counter);
        return counter;
    }

    default Counter resetCounter(String name) {
        Counter counter = getCounterByName(name);
        counter.setValue(0);
        save(counter);
        return counter;
    }
}
