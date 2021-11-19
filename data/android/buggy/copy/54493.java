@org.junit.Test
public void testAuthor() {
    assertNotNull("myAuthor was not instantiated!", myAuthor);
    assertEquals("myAuthor Manuscripts should be zero!", 0, myAuthor.getManuscriptCount());
}