package io.github.danielkhalils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration

@Configuration
@org.springframework.context.annotation.Configuration
public class MinhaConfiguration {

    @Bean
    public String application(){
        return "Sistema de Vendas";
    }
}
