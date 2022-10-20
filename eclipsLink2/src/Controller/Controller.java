package Controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Dao.EclipsConfig;
import Service.BookService;
import model.Book;

public class Controller {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EclipsConfig.class);
		
		BookService bookService = ctx.getBean(BookService.class);
		
		Book book = new Book();
		//book.setId(1);
		book.setAuthor("Ali");
		book.setTitle("???");
		
		bookService.selectById(7);
		
	}

}
