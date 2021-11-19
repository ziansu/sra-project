@org.junit.Test
public void getBookLists() throws java.lang.Exception {
    java.util.List<com.twu.biblioteca.model.Book> bookLists = bookStorageService.getBookLists();
    org.junit.Assert.assertEquals(5, bookLists.size());
}