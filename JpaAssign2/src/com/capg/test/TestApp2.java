package com.capg.test;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.assign.Author;

public class TestApp2 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaAssign2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select a from Author a");
		
		List<Author> b=(List<Author>)query.getResultList();
		
		
		for(Author book:b) {
		
			System.out.println(book);

		}
		
	
				
		
		
		entityManager.close();	
		

	}

}
