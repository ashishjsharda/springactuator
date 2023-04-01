package com.example.actuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonApplicationContextConfiguration {

    @Bean
    public RelationalDataSourceConfiguration relationalDataSourceConfiguration() {
        return new RelationalDataSourceConfiguration();
    }
}
