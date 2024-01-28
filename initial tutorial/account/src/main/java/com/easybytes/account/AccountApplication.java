package com.easybytes.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Account Microservice RestApi Document",
				description = "Account Microservice ",
				version = "V1",
				contact= @Contact(
						name = "Niranjan",
				email = "niranjan@gmail.com"
				),
				license = @License(
						name = "Nothing",
						url = "www.google.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Nothing to do",
				url = "www.google.com"
		)
)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
