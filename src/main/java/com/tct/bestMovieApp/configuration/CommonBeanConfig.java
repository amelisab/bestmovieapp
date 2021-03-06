package com.tct.bestMovieApp.configuration;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.tct.bestMovieApp.repository")
public class CommonBeanConfig {

	@Bean
	public StrongPasswordEncryptor strongEncryptor() {
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		return encryptor;
	}

}
