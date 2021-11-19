@org.junit.Test(expected = java.lang.NullPointerException.class)
public void testSetIterableNPE() throws java.lang.Exception {
    io.vertx.core.http.CaseInsensitiveHeaders cimap = new io.vertx.core.http.CaseInsensitiveHeaders();
    cimap.set("name", ((java.lang.Iterable<java.lang.String>) (null)));
}