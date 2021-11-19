@org.junit.Test
public void returnBookSuccessful() {
    java.util.ArrayList allBooks = bookSystem.getBookList();
    bookSystem.getBookByName("Test-Driven Development").setOnLoan(true);
    org.junit.Assert.assertEquals(bookSystem.returnBook("Test-Driven Development"), "Thank you for returning the book");
}