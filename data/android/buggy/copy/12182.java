@org.junit.Test
public void testEmptyChain() {
    org.junit.Assert.assertFalse("0", filter.accept(java.lang.Integer.valueOf(0)));
}