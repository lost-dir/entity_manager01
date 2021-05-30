package com.myproject.course.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
//import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "course")
public class Course {
	
	@Id
	@Column(name = "id_course")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCourse;
	
	@OneToOne
	@JoinColumn(name = "id_student", referencedColumnName = "id_student")
	private Student student;
	
	@OneToOne
	@JoinColumn(name = "id_teacher", referencedColumnName = "id_teacher")
	private Teacher teacher;
	
	@OneToOne
	@JoinColumn(name = "id_signature", referencedColumnName = "id_signature")
	private Signature signature;

	public Course() {
	}

	public Course(Student student, Teacher teacher, Signature signature) {
		this.student = student;
		this.teacher = teacher;
		this.signature = signature;
	}

	public Course(int idCourse, Student student, Teacher teacher, Signature signature) {
		this.idCourse = idCourse;
		this.student = student;
		this.teacher = teacher;
		this.signature = signature;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

	public int getIdCourse() {
		return idCourse;
	}

	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", student=" + student + ", teacher=" + teacher + ", signature="
				+ signature + "]";
	}
	
}
