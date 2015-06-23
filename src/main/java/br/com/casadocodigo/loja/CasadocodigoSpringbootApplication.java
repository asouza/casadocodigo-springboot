package br.com.casadocodigo.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CasadocodigoSpringbootApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(CasadocodigoSpringbootApplication.class, args);
    }
}
