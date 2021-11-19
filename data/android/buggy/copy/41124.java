@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterNullValue() {
    org.eclipse.virgo.repository.internal.StandardQueryTests.QUERY.addFilter("monkey", null);
}