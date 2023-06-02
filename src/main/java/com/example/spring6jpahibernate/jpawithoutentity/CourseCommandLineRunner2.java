package com.example.spring6jpahibernate.jpawithoutentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring6jpahibernate.course.Course;

@Component
public class CourseCommandLineRunner2 implements CommandLineRunner {
	
	//using CourseJpaRepository2 we don't need entity manager, we can call methods directly
	@Autowired
	private CourseJpaRepository2 repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(21, "AWS Developer Associate", "Anna Fisher"));
		repository.save(new Course(22, "Google Cloud", "Robert Johnson"));
		repository.save(new Course(23, "Oracle Certified Professional", "Frank Ramirez"));
		
		repository.deleteById(21);
		
		System.out.println(repository.findById(22));
		System.out.println(repository.findById(14));
		
		//use the custom method 
		System.out.println(repository.findByAuthor("Robert Johnson"));
		
	}
	
	

}
