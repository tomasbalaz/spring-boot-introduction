package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student jamal = new Student(
                    "Jamal",
                    "jamal.malik@gmail.com",
                    LocalDate.of(2000, DECEMBER, 1));

            Student alex = new Student(
                    "Alex",
                    "alex.malik@gmail.com",
                    LocalDate.of(2004, DECEMBER, 1));

                    List<Student> strings = new ArrayList<>();
                    strings.add(jamal);

            repository.saveAll(Stream.of(jamal, alex).collect(Collectors.toList()));

        };
    }
}
