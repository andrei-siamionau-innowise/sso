package com.demo.customerapp;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomerController {

    @GetMapping("/")
    public Map<String, Object> home(
            @AuthenticationPrincipal OidcUser user) {

        return Map.of(
                "application", "customer-app",
                "user", user.getPreferredUsername()
        );
    }

    @GetMapping("/me")
    public Map<String, Object> me(
            @AuthenticationPrincipal OidcUser user) {

        return Map.of(
                "name", user.getPreferredUsername(),
                "email", user.getEmail(),
                "claims", user.getClaims()
        );
    }
}