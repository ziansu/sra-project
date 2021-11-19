@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testSetIterableNPE() throws java.lang.Exception {
    new io.vertx.core.http.CaseInsensitiveHeaders().set("name", ((java.lang.Iterable<java.lang.String>) (null)));
}