package com.elliott.rpg.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase() {

        return args -> {
            System.out.println("Initiating the database");
        };
    }
}