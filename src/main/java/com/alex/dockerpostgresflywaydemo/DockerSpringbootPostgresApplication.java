package com.alex.dockerpostgresflywaydemo;

import com.alex.dockerpostgresflywaydemo.domain.Language;
import com.alex.dockerpostgresflywaydemo.persistence.LanguageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerSpringbootPostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringbootPostgresApplication.class, args);
    }

    @Bean
    public CommandLineRunner saveData(LanguageRepository repository) {
        return (args -> {
//            repository.save(new Language("Java", 1995));
//            repository.save(new Language("Ruby", 1995));
//            repository.save(new Language("Python", 1991));
//            repository.save(new Language("Go", 2009));
            repository.save(new Language("Scala", 2004, "Martin Odersky"));
        });
    }

}
