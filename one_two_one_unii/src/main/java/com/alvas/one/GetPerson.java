package com.alvas.one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("swajan");
		EntityManager em=emf.createEntityManager();
		Person person=em.find(Person.class,1);    // we get both pan and person detsils
		//Pan pan=em.find(Pan.class,1);   //   we get only pan details 
		if(person!=null)
		{
			System.out.println(person);
		}
		else
		{
			System.out.println("No persong found in the table");
		}

	}

}
