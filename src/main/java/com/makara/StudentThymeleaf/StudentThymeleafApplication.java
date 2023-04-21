package com.makara.StudentThymeleaf;

import com.makara.StudentThymeleaf.Entity.Student;
import com.makara.StudentThymeleaf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentThymeleafApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(StudentThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("Makara","Siem Reap","makara32@gmail.com");
		Student s2 = new Student("nika","Phnom Penh","nika45@gmail.com");
		Student s3 = new Student("sovannet","Kirirom","vanso112@gmail.com");
		Student s4 = new Student("Nha","kandal","Nhalove3@gmail.com");
		Student s5 = new Student("riya","prey veng","yasmall39@gmail.com");
		Student s6 = new Student("Rith","bmc","rithwork3@gmail.com");
		Student s7 = new Student("Ying","omc","yingcute3@gmail.com");
		repository.save(s1);
		repository.save(s2);
		repository.save(s3);
		repository.save(s4);
		repository.save(s5);
		repository.save(s6);
		repository.save(s7);

	}
}
