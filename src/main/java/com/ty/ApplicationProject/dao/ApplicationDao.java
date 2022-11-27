package com.ty.ApplicationProject.dao;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Query;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.ty.ApplicationProject.dto.Application;

	@Repository
	public class ApplicationDao {
		@Autowired
		EntityManager entityManager;

		public void saveApplication(Application application) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(application);
			entityTransaction.commit();
		}
		public Application updateApplication(Application application)
		{
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(application);
			entityTransaction.commit();
			return application;
		}
		public Application getById(int id)
		{
			Application application=entityManager.find( Application.class,id);
			return application;
		}
		

		public void removeApplication(int id) {
			
			Application application = entityManager.find(Application.class, id);
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			if (application != null) {
				entityManager.remove(application);
			}
			entityTransaction.commit();
		}

		public List<Application> getAllApplication() {
			
			Query query = entityManager.createQuery("Select a from Application a");
			List<Application> s = query.getResultList();

			System.out.println("All data fetched from table");
			return s;
		}
		public Application getApplicationByName(String app_name)
		{
		
			Query query=entityManager.createQuery("Select a from Application a where a.app_name=?1");
		return	(Application)query.setParameter(1, app_name).getSingleResult();
		}


	}



