package org.kodnest.HibernateOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	@Column(name="salary")
		String salary;
	@Column(name="age")
		String age;
	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	Address address;
		public Employee(String id, String name, String gender, String salay, String age) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.salary = salay;
			this.age = age;
			
		}
		public Employee() {
			// TODO Auto-generated constructor stub
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
		public String getSalay() {
			return salary;
		}
		public void setSalay(String salay) {
			this.salary = salay;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		
		
}
