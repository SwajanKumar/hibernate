package compsitehey;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveUser {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("swajan");
		EntityManager entityManage=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManage.getTransaction();
		
		UserId userId=new UserId();
		userId.setEmail("oggay@gmail.com");
		userId.setPhone("87493383020");
		
		User user=new User();
		user.setAge(25);
		user.setName("motu");
		user.setPassword("Motu@12345");
		user.setUserid(userId);
		
		entityTransaction.begin();
		entityManage.persist(user);
		entityTransaction.commit();
		
		System.out.println("#### DONE ####");
		
		
		

	}

}
