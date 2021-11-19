@org.testng.annotations.Test
public void testGetName() throws java.lang.Exception {
    java.lang.String name = studentDao.getName(1);
    assertEquals(name, "Jim");
}