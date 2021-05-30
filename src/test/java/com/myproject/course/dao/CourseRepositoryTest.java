package com.myproject.course.dao;

import org.junit.jupiter.api.Test;

import com.myproject.course.CourseApplication;
import com.myproject.course.entity.Course;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CourseApplication.class)
class CourseRepositoryTest {
	
	@Autowired
	private CourseRepository courseRepo;

	@Test
	void findById() {
		Course course = courseRepo.getCourse(1);
		assertEquals("math", course.getSignature().getName());
	}

}
