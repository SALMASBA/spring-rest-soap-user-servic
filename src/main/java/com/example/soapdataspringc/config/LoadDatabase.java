package com.example.soapdataspringc.config;

import com.example.soapdataspringc.model.User;
import com.example.soapdataspringc.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            repository.save(new User(1,"Jean", "Dupont", "jean.dupont@example.com", "Admin"));
            repository.save(new User(2,"Marie", "Durand", "marie.durand@example.com",
                    "User"));
            repository.save(new User(3,"Ali", "Ben", "ali.ben@example.com", "Manager"));
        };
    }
}