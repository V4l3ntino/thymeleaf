package com.thymeleaf.libros;

import com.thymeleaf.libros.model.entity.Student;
import com.thymeleaf.libros.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibrosApplication.class, args);
	}


	@Autowired
	StudentRepository objdb;
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Valentino", "Hontar", "valentino@gmail.com");
		Student student2 = new Student("Pepico", "Hontar", "valentino@gmail.com");
		Student student3 = new Student("Jose", "Hontar", "valentino@gmail.com");

		objdb.save(student1);
		objdb.save(student2);
		objdb.save(student3);
		 */
	}
}
