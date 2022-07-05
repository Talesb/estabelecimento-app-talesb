package br.edu.infnet.estabelecimentoapptalesb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableFeignClients
public class EstabelecimentoAppTalesbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstabelecimentoAppTalesbApplication.class, args);
	}

	@Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
}
