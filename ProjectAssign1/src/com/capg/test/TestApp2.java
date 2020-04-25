package com.capg.test;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.assign.Author;

public class TestApp2 {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ProjectAssign1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Author a1 = entityManager.find(Author.class,103);
		System.out.println(a1);
		
		a1.setMiddleName("M");
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		entityManager.persist(a1);
		System.out.println(a1);
		System.out.println("Updated the row successfully");
		transaction.commit();
		entityManager.close();

	}

}
