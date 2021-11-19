@org.junit.Test
public void resolve() throws java.lang.Exception {
    org.junit.Assert.assertEquals(java.util.Locale.CANADA, this.resolver.resolveLocale(request(java.util.Locale.CANADA)));
    org.junit.Assert.assertEquals(java.util.Locale.US, this.resolver.resolveLocale(request(java.util.Locale.US, java.util.Locale.CANADA)));
}