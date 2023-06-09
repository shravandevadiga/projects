package org.shravan.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.shravan.dto.Mobile;
import org.shravan.dto.Os;

public class Mobile_Os_Dao {
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null);
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	
	
	public void saveMobile(Mobile mobile)
	{
		entityTransaction.begin();
		entityManager.merge(mobile);
		entityTransaction.commit();
	}
	
	public void saveOs(Os os) {
		entityTransaction.begin();
		entityManager.persist(os);
		entityTransaction.commit();
	}


	public  void updateMobile(Mobile mobile)
	{
		entityTransaction.begin();
		entityManager.merge(mobile);
		entityTransaction.commit();
	}
	
	//
	
	public void findMobile(int id)
	{
		Mobile  mobile=entityManager.find(Mobile.class,id);
		System.out.println(mobile);
		
	}
	/*	public void deleteMobile(int id)
		{
			entityTransaction.begin();
	    Mobile mobile =entityManager.find(Mobile.class,id);
	    if (mobile!=null) {
	    	entityTransaction.remove(mobile);
	    	entityTransaction.commit();
			
		}else
	*///		System.out.println("object not found ");
				
		}
	


