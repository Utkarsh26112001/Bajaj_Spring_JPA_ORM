package com.bajaj.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit1");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Employee s1 = new Employee();
		s1.seteId(102);
		s1.setName("Devesh");
		s1.setSalary(2500);

		Employee s2 = new Employee();
		s2.seteId(103);
		s2.setName("Sumit");
		s2.setSalary(9000);

		Employee s3 = new Employee();
		s3.seteId(104);
		s3.setName("Kshitij");
		s3.setSalary(5000);

		em.persist(s1);
		em.persist(s2);
		em.persist(s3);

		em.getTransaction().commit();
		emf.close();
		em.close();
	}
}