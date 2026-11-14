package org.example.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class Hello {
    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/two")
    public String two() {
        return "two";
    }

    @DeleteMapping("/:id")
    public String delete(@PathVariable String id) {
        return "delete";
    }
}
