package com.vibodha.portfoliobackend.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vibodha.model.Contact;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ContactController {

    @GetMapping("/")
    public String home() {
        return "Backend is running successfully!";
    }

    @PostMapping("/contact")
    public String saveContact(@RequestBody Contact contact) {

        System.out.println("Name: " + contact.getName());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Message: " + contact.getMessage());

        return "Message received!";
    }
}