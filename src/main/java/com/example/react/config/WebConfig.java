package com.example.react.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 콘트롤러의 경로를 /api/* 로 만들거기 떄문에 그 경로만 허용한다
        registry
                .addMapping("/api/**")
                .allowedOrigins("http://localhost:3000")
        ;
    }
}
