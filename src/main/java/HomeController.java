package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
    String apiKey = "sk_test_FAKE_SECRET_KEY"; // 🔴 Secret ajouté ici
        return "Bienvenue sur l'application Spring Boot!";
    }
}
