package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.assign.Author;

public class TestApp3 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ProjectAssign1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Author a1 = entityManager.find(Author.class,101);
		
		if(a1!=null) {
			
			entityManager.getTransaction().begin();
			
			entityManager.remove(a1);
			
			entityManager.getTransaction().commit();
			System.out.println("object is removed from database");
		}else
		{
			System.out.println("object is not availble.!");
		}
		
				
		entityManager.close();	

	}

}
