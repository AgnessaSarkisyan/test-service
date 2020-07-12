package com.test.service.controller;

import com.test.service.ApiCounter;
import com.test.service.CounterApi;
import com.test.service.handler.AbstractApiHandler;
import com.test.service.mapstruct.CounterToApiMapper;
import com.test.service.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class CounterController extends AbstractApiHandler implements CounterApi {

    private final CounterService counterService;
    private final CounterToApiMapper mapper;

    @Autowired
    public CounterController(CounterService counterService,
                             CounterToApiMapper mapper) {
        this.counterService = counterService;
        this.mapper = mapper;
    }

    @Override
    public CompletableFuture<ResponseEntity<ApiCounter>> getCounter() {
        return createResponse(() -> mapper.toApiCounter(counterService.getCounter()));
    }

    @Override
    public CompletableFuture<ResponseEntity<ApiCounter>> incrementCounter() {
        return createResponse(() -> mapper.toApiCounter(counterService.incrementCounter()));
    }

    @Override
    public CompletableFuture<ResponseEntity<ApiCounter>> resetCounter() {
        return createResponse(() -> mapper.toApiCounter(counterService.resetCounter()));
    }
}
