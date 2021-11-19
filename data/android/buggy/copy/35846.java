@org.junit.Test
public void testFindingDouble() {
    java.lang.String test = receiptScanner.getTotalCost(listOfDoubles);
    assertEquals("299.0", test);
}