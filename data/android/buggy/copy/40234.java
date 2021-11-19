@org.junit.Test
public void testConvertWithMissingSourceClass() {
    java.lang.Object sourceObject = new java.lang.Object();
    java.lang.Object destinationObject = new java.lang.Object();
    java.lang.Object actualObject = objectUnderTest.convert(destinationObject, sourceObject, java.lang.Object.class, null);
    org.junit.Assert.assertEquals(destinationObject, actualObject);
}