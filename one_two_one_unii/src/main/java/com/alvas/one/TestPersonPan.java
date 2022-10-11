package com.alvas.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("swajan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction entityTransaction=em.getTransaction();
		Pan p=new Pan();
		p.setPanNo("udyhhhdhd");
		p.setAddress("alvas");
		Person p1=new Person();
		p1.setAge(12);
		p1.setMail("gaf@gmail.xom");
		p1.setName("swajan");
		p1.setPan(p);
		entityTransaction.begin();
		//em.persist(p);
		em.persist(p1);
		entityTransaction.commit();
		
		
		
 
	}

}
