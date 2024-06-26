package com.example.servicoEntregaKiki.infra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
        // .allowedOrigins("http://192.168.0.102:5500") // Adicione a origem que deseja
        // permitir
        // .allowedMethods("GET", "POST", "PUT", "DELETE"); // Métodos HTTP permitidos
    }
}