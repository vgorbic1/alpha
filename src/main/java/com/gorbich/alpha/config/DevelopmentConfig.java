package com.gorbich.alpha.config;

import com.gorbich.alpha.backend.service.EmailService;
import com.gorbich.alpha.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("file:///D:/STS/alpha/app-dev.properties")
public class DevelopmentConfig {
    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
