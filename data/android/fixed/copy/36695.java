@org.junit.Test
public void resolvePreferredSupported() throws java.lang.Exception {
    this.resolver.setSupportedLocales(java.util.Collections.singletonList(java.util.Locale.CANADA));
    assertEquals(java.util.Locale.CANADA, this.resolver.resolveLocale(request(java.util.Locale.US, java.util.Locale.CANADA)));
}