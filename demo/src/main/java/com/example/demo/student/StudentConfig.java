package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student gabriel = new Student(
                    1L,
                    "Gabriel",
                    "a@a.a",
                    LocalDate.of(2000, FEBRUARY, 10)
            );

            repository.save(gabriel);
        };
    }
}
