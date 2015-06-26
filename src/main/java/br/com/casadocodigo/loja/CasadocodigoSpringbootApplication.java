package br.com.casadocodigo.loja;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@EnableAutoConfiguration
public class CasadocodigoSpringbootApplication {
	@Bean
	public DataSource dataSource(Environment environment) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/casadocodigo");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CasadocodigoSpringbootApplication.class, args);
	}
}
