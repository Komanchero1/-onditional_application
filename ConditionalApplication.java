package org.example.conditional_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Делает ConditionalApplication также контроллером
@RequestMapping("/") // Определяет общий путь для методов контроллера
public class ConditionalApplication {

    private final SystemProfile profile;

    // Добавляем SystemProfile через конструктор
    public ConditionalApplication(SystemProfile profile) {
        this.profile = profile;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConditionalApplication.class, args);
    }

    @GetMapping("profile") // Обработка GET-запросов на /profile
    public String getProfile() {
        return profile.getProfile();
    }
}