@org.junit.Test
@java.lang.SuppressWarnings(value = "static-method")
public void shouldEncodeZeroToLowerA() {
    final java.math.BigInteger input = java.math.BigInteger.ZERO;
    final java.lang.String base62 = com.github.sebhoss.identifier.service.Base62.encode(input);
    org.junit.Assert.assertEquals("a", base62);
}