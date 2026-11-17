package org.example.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class Hello {
    public record HelloResponse(String message) {
    }

    @GetMapping
    public HelloResponse sayHello() {
        return new HelloResponse("Hello Pufferfishes!!!");
    }

}
