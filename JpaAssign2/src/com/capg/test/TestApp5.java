package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.assign.Author;

public class TestApp5 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaAssign2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select a.name from Book a where a.isbn='456PRT'");
		
		String a = (String)query.getSingleResult();
		
		System.out.println(a);

	}

}
