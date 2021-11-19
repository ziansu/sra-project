@org.junit.Test
public void testGetSetUniqueId() {
    fact.setUniqueIds(java.util.Arrays.asList("TEST"));
    java.util.List<java.lang.String> ids = fact.getUniqueIds();
    assertTrue(ids.contains("TEST"));
}