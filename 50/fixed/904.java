@org.junit.Test
public void shouldGetNullBookById() throws java.lang.Exception {
    assertEquals(null, bookStorageService.getBookById(10));
}