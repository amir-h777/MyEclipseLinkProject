package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import model.Book;

public class BookDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void setEntityManager(EntityManager entityManager) {
		
		this.entityManager = entityManager;
		
	}
	
	public void save(Book book) {
		
		entityManager.persist(book);
		entityManager.flush();
		
	}
	
	public void update(Book book) {
		
		entityManager.merge(book);
		
	}
	
	public void delete(Book book) {
		book = entityManager.merge(book);
		
		entityManager.remove(book);
		
	}
	
	public void selectById(int id) {
		Book book = new Book();
		
		book = entityManager.find(Book.class, id);
		System.out.println(book);
		
	}
	
	/*public void selectAll(){
		
		Query query = entityManager.createQuery("FROM Book");
		System.out.println(query.getResultList());

		
	}*/

}
