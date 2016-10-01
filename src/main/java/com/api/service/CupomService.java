package com.api.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.api.model.Cupom;

public class CupomService {
	private EntityManagerFactory emf;
	
	public CupomService(){
		emf = Persistence.createEntityManagerFactory("CupomApi");
	}
	
	public int persistCupom(Cupom cupom){
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cupom);
		em.getTransaction().commit();
		em.close();
		
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cupom> getCupons(){
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT c FROM Cupom c");
		List<Cupom> cupons = query.getResultList();
		
		return cupons;
	}
}
