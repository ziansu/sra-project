@org.junit.Test
public void testEquilateral() {
    de.demo.Triangle instance = new de.demo.Triangle("1", "1", "1");
    java.lang.String expResult = "Equilateral";
    java.lang.String result = instance.determineTriangleType();
    assertEquals(expResult, result);
}