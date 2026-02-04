package dateapi.controller;

import dateapi.model.GetDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class DateController {


    @GetMapping("/day-of-month")
    public GetDay getDayOfMonth(@RequestParam String date) {
        try {

            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
            int dayOfMonth = localDate.getDayOfMonth();

            return new GetDay(date, dayOfMonth, "success");
        } catch (Exception e) {
            return new GetDay(date, 0, "error: invalid date format. use YYYY-MM-DD");

        }
    }
}

