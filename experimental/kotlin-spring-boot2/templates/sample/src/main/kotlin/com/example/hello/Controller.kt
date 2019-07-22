package com.example.hello

import org.springframework.web.bind.annotation.RestController
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@RestController
class Controller {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello from Appsody!"
    }
}
