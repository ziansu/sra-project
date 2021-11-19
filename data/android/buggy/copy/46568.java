@org.junit.Test
public void testPut_OK() {
    tracker.put("", "1");
    org.junit.Assert.assertEquals("1", tracker.getMappedValue("", java.lang.String.class));
}