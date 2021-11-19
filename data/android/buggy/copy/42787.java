@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void shouldThrowIllegalArgumentExceptionBecauseClientNameIsNull() {
    tds.session.ExternalSessionConfiguration externalSessionConfiguration = new tds.session.ExternalSessionConfiguration(null, "Production", 0, 0);
}