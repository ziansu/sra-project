@org.junit.Test
public void testHashcodeBothNull() {
    handler.setFormat(null);
    handler.setBufferedWriter(null);
    org.junit.Assert.assertEquals(1, handler.hashCode());
}