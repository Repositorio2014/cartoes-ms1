package br.com.cartoes_ms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CartoesMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(CartoesMs1Application.class, args);
	}

}
