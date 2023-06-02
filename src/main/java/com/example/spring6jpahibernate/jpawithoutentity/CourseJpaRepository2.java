package com.example.spring6jpahibernate.jpawithoutentity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring6jpahibernate.course.Course;

//Course: the entity it manages
//Integer: type of the id field
public interface CourseJpaRepository2 extends JpaRepository<Course, Integer> {

	//define custom method
	List<Course> findByAuthor(String author);
}
