import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import com.freetipscentral.domain.Book;
import com.freetipscentral.domain.Books;
import com.freetipscentral.utility.BookCreator;
 
@Path("/postJSON")
public class PostJsonService {
 
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Book> getBookAsJSON(Books books) {
		List<Book> bookList = BookCreator.getBooks();
		bookList.addAll(books.getBooks());
 
		return bookList;
	}
}