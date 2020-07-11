package com.test.service.controller;

import com.test.service.ApiCounter;
import com.test.service.CounterApi;
import com.test.service.handler.AbstractApiHandler;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class CounterController extends AbstractApiHandler implements CounterApi {

    @Override
    public CompletableFuture<ResponseEntity<ApiCounter>> getCounter() {
        return null;
    }

    @Override
    public CompletableFuture<ResponseEntity<ApiCounter>> incrementCounter() {
        return null;
    }

    @Override
    public CompletableFuture<ResponseEntity<ApiCounter>> resetCounter() {
        return null;
    }
}
