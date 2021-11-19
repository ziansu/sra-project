public void shouldReturnBookByName() {
    com.twu.biblioteca.model.Book shouldBe = new com.twu.biblioteca.model.Book(1, "Java Language", "GoodWeather", "2005");
    com.twu.biblioteca.model.Book book = bookStorageService.searchBookByName("Java Language");
    org.junit.Assert.assertEquals(shouldBe, book);
}