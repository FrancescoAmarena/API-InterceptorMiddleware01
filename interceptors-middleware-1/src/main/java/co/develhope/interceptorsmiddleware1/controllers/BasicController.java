package co.develhope.interceptorsmiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;


@RequestMapping("/api")
@RestController
public  class BasicController {
    @GetMapping("/time")
    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }
}