@com.flatironschool.javacs.Test
public void testGetVersion() throws java.lang.Exception {
    com.flatironschool.javacs.HelloWorld main = new com.flatironschool.javacs.HelloWorld();
    org.junit.Assert.assertTrue(((main.getVersion()) >= 1.7));
}