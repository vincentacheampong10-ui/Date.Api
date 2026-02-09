package dateapi.controller;

import dateapi.model.GetString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/reverse")
    public String reverseString(@RequestParam String text) {
        try {
            return new GetString(text).getReversed();
        } catch (Exception e) {
            return "error: unable to reverse string";
        }
    }
        @GetMapping("/opposite")
        public String oppositeString(@RequestParam String text) {
            try {
                return new GetString(text).getOpposite();
            } catch (Exception e) {
                return "error: unable to reverse string";
            }
    }
}
