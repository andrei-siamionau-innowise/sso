package com.demo.customerapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

    @GetMapping("/logout-all")
    public String logout(HttpServletRequest request)
            throws ServletException {

        request.logout();

        return "redirect:/";
    }
}
