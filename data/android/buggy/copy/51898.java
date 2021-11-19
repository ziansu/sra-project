@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testAddFilterWithParametersNullName() {
    org.eclipse.virgo.repository.internal.StandardQueryTests.QUERY.addFilter(null, "bananas", new java.util.HashMap<java.lang.String, java.util.Set<java.lang.String>>(0));
}