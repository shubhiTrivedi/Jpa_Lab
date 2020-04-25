package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.assign.Author;

public class TestApp4 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ProjectAssign1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Author a1 = entityManager.find(Author.class,102);
		System.out.println(a1);
		
		entityManager.close();		

	}

}
