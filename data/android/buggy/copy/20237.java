@Test
public void getBooksByName() throws exception.TableIsEmptyException {
    java.util.List<model.Book> bookList = adminController.getBooksByName("We the Living");
    Assert.assertNotNull(bookList);
    Assert.assertEquals(1, bookList.size());
}