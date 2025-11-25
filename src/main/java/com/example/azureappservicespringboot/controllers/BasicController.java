package com.example.azureappservicespringboot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class BasicController {

    @GetMapping("/welcome")
    public ResponseEntity<BasicResponseDTO> sayHello() {
        return ResponseEntity.ok(new BasicResponseDTO("Ashraf Esmali", 36));
    }
}
