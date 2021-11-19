@org.junit.Test
public void testGetMappedValue_NoSuchType() {
    tracker.put("", new java.util.HashSet());
    org.junit.Assert.assertNull(tracker.getMappedValue("", java.lang.String.class));
}