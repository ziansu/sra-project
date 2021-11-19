@org.junit.Test
public void bookRemovedFromListWhenCheckedOut() {
    java.util.ArrayList<com.twu.biblioteca.Book> originalBooks = bookSystem.getBookList();
    com.twu.biblioteca.Book book = bookSystem.getBookByName("Test-Driven Development");
    bookSystem.checkOutBook(book);
    org.junit.Assert.assertEquals(book.isOnLoan(), true);
}