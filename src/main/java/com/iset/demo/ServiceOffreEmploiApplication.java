package com.iset.demo;

import com.iset.demo.Entity.Offre;
import com.iset.demo.Repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceOffreEmploiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOffreEmploiApplication.class, args);
	}
	@Autowired
	OffreRepository OR;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		OR.save(new Offre("Web Design",
				"informatique","AXA", 2, "France"));
		OR.save(new Offre("Developpeur",
				"informatique","Talys", 3, "Tunisie"));
		OR.save(new Offre("Architecte",
				"informatique","SIS", 2, "Allemagne"));

	}
}







