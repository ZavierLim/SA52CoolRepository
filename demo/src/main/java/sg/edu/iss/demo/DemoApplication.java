package sg.edu.iss.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import iss.edu.iss.demo.repo.StudentRepository;
import sg.edu.iss.demo.domain.Student;

@SpringBootApplication
public class DemoApplication {

	@Autowired 
	StudentRepository srepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
	return args -> {
		System.out.println("Let's inspect the beans provided by Spring Boot:");
		Customer c = new Customer("1", "Suria");
		System.out.println(c.toString());
		
		Student s1= new Student("Hou lu","sweet",null,5000.00,4.50);
		Student s2= new Student("Zavier","sweet",null,5000.00,4.50);
		srepo.save(s1);srepo.save(s2);
//		
//		// no need CRUD because when i setup repository, it is auto computed.
//		List<Student> list=srepo.findAll();
//		for(Student student:list) {
//			System.out.println("Record from db"+student.toString());
//		}
	};
}
}
