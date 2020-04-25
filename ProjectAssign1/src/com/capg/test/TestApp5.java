package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.assign.Author;

public class TestApp5 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ProjectAssign1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select a from Author a where a.authorId=104");
		
		Author a = (Author)query.getSingleResult();
		
		System.out.println(a);
				
		
		entityManager.close();	
		

	}

}
