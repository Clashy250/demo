package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
CommandLineRunner commandLineRunner(StudentRepository repository ){

    return args -> {

                Student mariam=new Student(
                        "josh",
                        "nd@gmail.com",
                        LocalDate.of(2000, 5, 1)


                );

         Student ndenge = new Student(
                "ndenge",
                "r4@gmail.com",
                LocalDate.of(2000, 5, 5)


        );
        repository.saveAll(
                List.of(mariam, ndenge)
        );

    };

    }
}


