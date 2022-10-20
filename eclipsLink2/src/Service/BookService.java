package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import Dao.BookDao;
import model.Book;

@Transactional
public class BookService {
	
	@Autowired
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public void save(Book book) {
		
		bookDao.save(book);
		
	}
	
	public void update(Book book) {
		
		bookDao.update(book);
		
	}
	
	public void delete(Book book) {
		
		bookDao.delete(book);
		
	}
	
	public void selectById(int id) {
		
		bookDao.selectById(id);
		
	}
	
	/*public void selectAll() {
		
		bookDao.selectAll();
		
	}*/

}
