package com.oewami.SRS;

import com.oewami.SRS.Vocabulary.Card;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@SpringBootApplication
public class SrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrsApplication.class, args);
	}



}
