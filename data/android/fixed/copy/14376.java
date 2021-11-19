@org.junit.Test
public void testConvertWithMissingDestinationClass() {
    java.lang.Object sourceObject = new java.lang.Object();
    java.lang.Object destinationObject = new java.lang.Object();
    java.lang.Object actualObject = objectUnderTest.convert(destinationObject, sourceObject, null, java.lang.Object.class);
    assertEquals(destinationObject, actualObject);
}