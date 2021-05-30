package com.myproject.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signature")
public class Signature {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_signature;
	@Column(name = "name", nullable = false)
	private String name;
	
	public Signature() {
	}
	
	public Signature(String name) {
		this.name = name;
	}
	
	public Signature(int id_signature, String name) {
		this.id_signature = id_signature;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getid_signature() {
		return id_signature;
	}
	
	@Override
	public String toString() {
		return "Signature [id_signature=" + id_signature + ", name=" + name + "]";
	}
}
