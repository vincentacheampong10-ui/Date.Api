package dateapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateApiApplication.class, args);
        System.out.println("Date API started on http://localhost:8080");
    }
}