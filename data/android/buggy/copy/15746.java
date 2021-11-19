@org.junit.Test
public void selectByIdTest() {
    java.lang.System.out.println(userDAO.selectById(1));
    org.junit.Assert.assertEquals("USER1", userDAO.selectById(1).getUserName());
}