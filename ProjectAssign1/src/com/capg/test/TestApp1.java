package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.assign.Author;

public class TestApp1 {
	public static void main(String[] args) {
		
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ProjectAssign1");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Author a1=new Author();
	a1.setAuthorId(101);
	a1.setFirstName("Shivendra");
	a1.setMiddleName("Pratap");
	a1.setLastName("Singh");
	a1.setPhoneNo(789043215);
	
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	
	entityManager.persist(a1);
	
	entityTransaction.commit();
	
	System.out.println("object is saved into database table");
	
	entityManager.close();
}

}
