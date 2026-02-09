package dateapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateApiApplication.class, args);
        System.out.println("Date API started on http://localhost:8080/day-of-month?date=2024-03-31");
        System.out.println("Date API started on http://localhost:8080/reverse?text=yellow");
    }
}