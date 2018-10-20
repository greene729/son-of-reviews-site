package org.wecancodeit.sonofreviewssite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonOfReviewsSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonOfReviewsSiteApplication.class, args);
		System.out.println("Server running on localhost:8080");
	}
}
