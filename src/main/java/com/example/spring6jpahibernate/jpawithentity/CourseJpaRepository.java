package com.example.spring6jpahibernate.jpawithentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.spring6jpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	public void insert(Course course) {
		
		entityManager.merge(course);
		
	}
	
	
	
}
