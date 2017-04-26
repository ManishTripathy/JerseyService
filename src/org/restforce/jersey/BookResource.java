package org.restforce.jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.restforce.api.Book;
import org.restforce.service.BookService;
import org.restforce.service.impl.DummyBookServiceImpl;

@Path("/books")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class BookResource {
	
	private BookService bookService = new DummyBookServiceImpl();
	
	@GET
	public Response getAllBooks() {
		List<Book> books = bookService.getAllBooks();
		return Response.ok().entity(books).build();
	}
	
}
