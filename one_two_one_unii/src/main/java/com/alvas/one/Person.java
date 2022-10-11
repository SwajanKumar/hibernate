package com.alvas.one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CascadeType;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String mail;
	private String name;
	private int age;
	//@OneToOne(cascade=CascadeType.REMOVE)
	Pan pan;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", mail=" + mail + ", name=" + name + ", age=" + age + "]";
//	}
	
	public Pan getPan(){
		return pan;
	}
	public void setPan(Pan pan){
		this.pan=pan;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", mail=" + mail + ", name=" + name + ", age=" + age + ", pan=" + pan + "]";
	}
	
	

}
