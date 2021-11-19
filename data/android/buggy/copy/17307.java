@org.junit.Test(expected = java.lang.Exception.class)
public void testSetEnabledNullThrowsException() throws java.lang.Exception {
    org.owasp.webgoat.session.LabelDebugger ld = new org.owasp.webgoat.session.LabelDebugger();
    ld.setEnabled(null);
}