@org.junit.Test
public void shouldBorrowBook1() throws java.lang.Exception {
    boolean b = bookStorageService.borrowBookId(1);
    org.junit.Assert.assertTrue(b);
    com.twu.biblioteca.model.Book bookById = bookStorageService.getBookById(1);
    org.junit.Assert.assertEquals(0, bookById.getStatus());
}