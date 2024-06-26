package org.example.projectnoname.controllers;

import org.springframework.ui.Model;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String homePage(Model model) {
        // Retrieve the currently authenticated user's username
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();


        // Pass the username to the view
        model.addAttribute("username", username);

        return "home";
    }

    @GetMapping("/settings")
    public String settings(Model model) {
        return "userSettings";
    }
}
