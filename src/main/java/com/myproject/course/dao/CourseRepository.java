package com.myproject.course.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myproject.course.entity.Course;

@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	private EntityManager em;
	
	public Course getCourse(int id) {
		return em.find(Course.class, id);
	}
}
