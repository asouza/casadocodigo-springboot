package br.com.casadocodigo.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class CasadocodigoSpringbootApplication {
	
	@RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }	

    public static void main(String[] args) {
        SpringApplication.run(CasadocodigoSpringbootApplication.class, args);
    }
}
