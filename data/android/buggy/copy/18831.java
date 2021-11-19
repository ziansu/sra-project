@org.junit.Test
public void testThrowThrowable() {
    final java.lang.Exception e = new java.lang.Exception("exc");
    final com.twitter.util.Throw t = new com.twitter.util.Throw(e);
    org.junit.Assert.assertEquals(t.throwable(), e);
}