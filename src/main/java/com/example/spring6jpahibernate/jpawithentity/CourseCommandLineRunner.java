package com.example.spring6jpahibernate.jpawithentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring6jpahibernate.course.Course;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(13, "Physics", "Thomas Bridgewater"));
		repository.insert(new Course(14, "Chemistry", "Peter White"));
		repository.insert(new Course(15, "Math", "Jenny D. Davis"));		
		
	}
	
	
	

}
