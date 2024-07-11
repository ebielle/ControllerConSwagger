package com.example.demo_jdk.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()

public class NameController {

    @GetMapping
    public ResponseEntity<String> namePerson(@RequestParam String name1) {
        return ResponseEntity.ok(name1);
    }

    @PostMapping
    public ResponseEntity<String> namePersonReverse(@RequestParam String name2) {
        String reverseName = new StringBuilder(name2).reverse().toString();
        return ResponseEntity.ok(reverseName);
    }
}