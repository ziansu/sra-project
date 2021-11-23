@org.junit.Test
public void shouldAssertSame() {
    java.lang.Integer expected = java.lang.Integer.valueOf(768);
    java.lang.Integer actual = expected;
    org.junit.Assert.assertSame(expected, actual);
}