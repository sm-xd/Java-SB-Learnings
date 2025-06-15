package com.sm.sbh2demo;

import com.sm.sbh2demo.model.Student;
import com.sm.sbh2demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SbH2DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SbH2DemoApplication.class, args);
		System.out.println("================Running=================");
		Student s= context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Navin");
		s.setMarks(78);
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);
	}

}
