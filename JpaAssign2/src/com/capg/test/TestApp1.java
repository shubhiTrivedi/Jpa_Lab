package com.capg.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.assign.Author;
import com.capg.assign.Book;

public class TestApp1 {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaAssign2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		//Author a1=new Author(100,"Ravi");
		//Author a2=new Author(200,"Ramesh");
		
		
		Book b1=new Book(300,"Vanshika","123ABC","Avengers",400);
		Book b2=new Book(400,"Sriya","456PRT","Strangers",500);
		Book b3=new Book(500,"Shubham","E3R5TT","The Black",650);
		Book b4=new Book(600,"Shubhi","EGHT78","Horror Boat",700);
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
	
		
		//entityManager.persist(a1);
		//entityManager.persist(a2);
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(b3);
		entityManager.persist(b4);
		
		
		entityTransaction.commit();
		
		
		
		System.out.println("Objects saved into table.!");
		entityManager.close();
		
		

	}

}
