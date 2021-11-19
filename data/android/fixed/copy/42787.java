@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void shouldThrowIllegalArgumentExceptionBecauseClientNameIsNull() {
    new tds.session.ExternalSessionConfiguration(null, "Production", 0, 0, 0, 0);
}