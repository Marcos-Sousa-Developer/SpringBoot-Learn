package spring.boot.learn.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student github = new Student(
                    "Github",
                    "mm@github.com",
                    LocalDate.of(1990, Month.JANUARY, 1)
            );
            studentRepository.save(github);
        };
    }
}
