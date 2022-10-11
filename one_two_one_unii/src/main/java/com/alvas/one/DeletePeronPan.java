package com.alvas.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePeronPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("swajan");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person person=em.find(Person.class,1);
		
		if(person!=null)
		{
			et.begin();
			em.remove(person);
			et.commit();
			System.out.println(person);
		}
		else
		{
			System.out.println("No person is  found in the table");
		}


	}

}
