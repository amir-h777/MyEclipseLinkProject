package Dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import Service.BookService;

@Configuration
@ImportResource({"Config.xml"})
public class EclipsConfig {

	@Bean
	public BookDao getBookDao() {
		
		return new BookDao();
		
	}
	
	@Bean
	public BookService getBookService() {
		
		return new BookService();
		
	}
	
}
