@edu.hm.shareit.resources.POST
@edu.hm.shareit.resources.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response createBook(edu.hm.fachklassen.Book book) {
    final edu.hm.shareit.resources.BookServiceResult result = bookService.addBook(book);
    return javax.ws.rs.core.Response.status(result.getStatus()).entity(getJsonFromServiceResult(result)).build();
}