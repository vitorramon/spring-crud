package br.com.fmf.cliente.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/cliente")
                .allowedOrigins("http://127.0.0.1:5500") // Defina a origem permitida
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Defina os métodos HTTP permitidos
                .allowedHeaders("*") // Defina os cabeçalhos permitidos
                .allowCredentials(true); // Permita envio de credenciais (cookies)
    }
}
