package io.github.danielkhalils;

import io.github.danielkhalils.model.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {

    @Bean (name  = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
          System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }
}
