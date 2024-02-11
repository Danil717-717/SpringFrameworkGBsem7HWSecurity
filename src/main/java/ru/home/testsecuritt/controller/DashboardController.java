package ru.home.testsecuritt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class DashboardController {

    @GetMapping("/")
    public String dashboard() {
        return "Welcome to dashboard";
    }



    @GetMapping("/admin")
    public String admin() {
        return "You can view this only if you are admin";
    }

    @GetMapping("/staff")
    public String staff() {
        return "If you are admin or staff, you can access this page.";
    }

}
