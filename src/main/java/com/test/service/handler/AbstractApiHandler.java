package com.test.service.handler;

import org.springframework.http.ResponseEntity;

import java.util.concurrent.CompletableFuture;

public abstract class AbstractApiHandler {
    protected <T> CompletableFuture<ResponseEntity<T>> createResponse(BodySupplier<T> bodySupplier) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                T body = bodySupplier.get();
                return ResponseEntity
                        .ok()
                        .body(body);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        });
    }
    @FunctionalInterface
    protected interface BodySupplier<T> {
        T get() throws Exception;
    }
}
