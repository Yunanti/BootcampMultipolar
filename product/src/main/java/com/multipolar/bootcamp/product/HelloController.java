package com.multipolar.bootcamp.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> todos(){
        List<Todo> todoList = List.of(
                new Todo(1, "Makanan"),
                new Todo(2, "Minuman")
        );
        return ResponseEntity.ok(todoList);
    }
}
