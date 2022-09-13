package io.github.danielkhalils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = (""))
@RestController
public class VendasApplication {

    @Cachorro
    private Animal animal;

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            this.animal.fazerBarulho();
        };
    }
    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public  String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
