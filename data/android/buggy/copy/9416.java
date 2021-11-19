@org.junit.Test
public void unsuccessfulCheckoutMessageDisplayed() {
    com.twu.biblioteca.Book book = bookSystem.getBookByName("Dr. Seuss");
    org.junit.Assert.assertEquals(bookSystem.checkOutBook(book), "That book is not available");
}