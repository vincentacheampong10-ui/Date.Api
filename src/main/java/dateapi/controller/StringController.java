package dateapi.controller;

import dateapi.model.GetString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/reverse")
    public GetString reverseString(@RequestParam String text) {
        try {
             return new GetString(text);
        } catch (Exception e) {
            return new GetString( "error: unable to reverse string");
        }
    }
}
