@org.junit.Test
public void testGetTitle() {
    java.lang.System.out.println("getTitle");
    Classes.Word instance = new Classes.Word();
    java.lang.String expResult = null;
    java.lang.String result = instance.getTitle();
    assertEquals(expResult, result);
}