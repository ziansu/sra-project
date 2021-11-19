@org.junit.Test
public void testValidDataInvalidColumnColumnTotal() {
    assertEquals(0.0, org.jfree.data.junit.DataUtilities.calculateColumnTotal(null, 1), 1.0E-7);
}