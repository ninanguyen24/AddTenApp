package com.addten.bootcamp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddTenController {
    @RequestMapping("/api/{num}")
    public int index(@PathVariable("num") int num) {
        return 10 + num;
    }
}
