package com.ticketManager.OOPCW.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class AppConfig {

    @Bean
    public ExecutorService executorService() {
        // Thread pool to handle customer and vendor threads
        return Executors.newCachedThreadPool();
    }
}
