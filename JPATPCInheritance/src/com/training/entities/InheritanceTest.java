package com.training.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee=new Employee();
		employee.setName("Manav");
		employee.setSalary(10000);
		em.persist(employee);
		
		//create one manager
		Manager manager=new Manager();
		manager.setName("Purva");
		manager.setSalary(12000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		
		em.getTransaction().commit();
		
				em.close();
		factory.close();
				System.out.println("Added one employee and manager to database.");

	
	
	}
		
}

	
	

