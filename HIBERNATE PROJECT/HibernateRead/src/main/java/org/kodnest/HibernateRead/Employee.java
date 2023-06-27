package org.kodnest.HibernateRead;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Column(name="id")
@Id
	String id;
@Column(name="name")
	String name;
@Column(name="gender")
	String gender;
@Column(name="salay")
	String salay;
@Column(name="age")
	String age;
	public Employee(String id, String name, String gender, String salay, String age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salay = salay;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSalary() {
		return salay;
	}
	public void setSalary(String salary) {
		this.salay = salary;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+""+name+""+salay+""+gender+""+age;
	}
}
