@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void shouldThrowIllegalArgumentExceptionBecauseEnvironmentIsNull() {
    tds.session.ExternalSessionConfiguration externalSessionConfiguration = new tds.session.ExternalSessionConfiguration("UNIT_TEST", null, 0, 0);
}