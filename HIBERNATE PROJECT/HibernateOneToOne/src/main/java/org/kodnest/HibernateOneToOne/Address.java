package org.kodnest.HibernateOneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Column(name="id")
	@Id
String id;
	@Column(name="city")
String city;
@OneToOne
	@JoinColumn(name="emp_id")
	Employee employee;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String id, String city, Employee employee) {
		super();
		this.id = id;
		this.city = city;
		this.employee = employee;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
