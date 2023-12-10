package src.main.java.com.example.skillboost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SkillBoostApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillBoostApplication.class, args);
    }

}
