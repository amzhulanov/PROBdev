package com.jam.example.paymentservice.entities.threads;

import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class ThreadForTask  {
    public void newThread(UUID id_task) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture=
                CompletableFuture.supplyAsync(()->{
                    System.out.println("Выполняю задачу из базы");
                    return "success";
                });
        System.out.println(completableFuture.get());

    }
}
