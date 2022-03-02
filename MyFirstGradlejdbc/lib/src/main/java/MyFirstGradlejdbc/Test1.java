package MyFirstGradlejdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student s1 = new Student();
		s1.setId(102);
		s1.setName("Khushi");
		s1.setFees(2000);
		
		em.persist(s1);
		em.getTransaction().commit();
		emf.close();
		em.close();
	}
}
