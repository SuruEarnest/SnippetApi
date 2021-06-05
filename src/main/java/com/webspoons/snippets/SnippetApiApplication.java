package com.webspoons.snippets;
import org.springframework.boot.CommandLineRunner; 
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnippetApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SnippetApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("App started running");
		
	}

}
