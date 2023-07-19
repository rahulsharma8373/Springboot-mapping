package com.mapping.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mapping.jpa.model.InstructorDetail;
import com.mapping.jpa.repository.InstructorRepository;
import com.mapping.jpa.model.Instructor;

@SpringBootApplication
public class SpringbootJpaOneToOneExampleApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaOneToOneExampleApplication.class, args);
	}
	  @Autowired
	    private InstructorRepository instructorRepository;


	@Override
	public void run(String... args) throws Exception {
		Instructor instructor=new Instructor("Rahul", "kumar", "Sharma@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("Java Guides", "Cricket Playing");
instructor.setInstructorDetail(instructorDetail);
instructorRepository.save(instructor);
	}

}
