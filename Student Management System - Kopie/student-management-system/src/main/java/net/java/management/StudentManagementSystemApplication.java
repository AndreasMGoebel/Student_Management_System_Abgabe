package net.java.management;

import net.java.management.entity.Module;
import net.java.management.entity.Student;
import net.java.management.repository.ModuleRepository;
import net.java.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ModuleRepository moduleRepository;
	
	@Override
	public void run(String... args) throws Exception {
		

		Student student1 = new Student("Alec", "Hutner", "alec@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Andeas", "Gäbel", "andeas@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Luc", "Stolz", "luc@gmail.com");
		studentRepository.save(student3);


		Module module1 = new Module("Verteilte Systeme", 22);
		moduleRepository.save(module1);

	}

}
