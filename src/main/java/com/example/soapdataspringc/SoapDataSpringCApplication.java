package com.example.soapdataspringc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SoapDataSpringCApplication  {
    public static void main(String[] args) {
        SpringApplication.run(SoapDataSpringCApplication.class, args);
        System.out.println("✅ Serveur REST démarré : http://localhost:8080/users");
    }
}
