package org.kodnest.HibernateDaoPattern;

import java.util.List;
import java.util.Scanner;


import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import org.hibernate.*;
import org.hibernate.Query;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDAO ref=new EmployeeDAOImplement();
    	//1st operation
    /*	List<Employee> emplist=ref.getEmployees();
    	for (Employee employee : emplist) {
			System.out.println(employee);
		}*/
    	
    	//2nd Operatrion
    	
    	Employee emp=ref.getEmployeeById(1);
    	System.out.println(emp);
    	
    	/*	
    Employee e=new Employee("Ganesh", "Training");
    String status=ref.persistEmployee(e);
    System.out.println(status);
    }
    */
    	/*
    	Employee e=ref.getEmployeeById(5);
    	String status=ref.deleteEmployee(e);
    	System.out.println(status);
    	  */
    	
    	/*Employee e=ref.getEmployeeById(2);
    	e.setDepartment("IT");
    	String status=ref.updateEmployee(e);
    	System.out.println(status); */
}
}





