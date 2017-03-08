package com.gorbich.alpha.config;

import com.gorbich.alpha.backend.service.EmailService;
import com.gorbich.alpha.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file:///D:/STS/alpha/app-prod.properties")
public class ProductionConfig {
	@Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}
