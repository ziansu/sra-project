@org.junit.Test
public void testValidationPort() {
    java.lang.System.out.println("validationPort");
    for (java.lang.String port : ports) {
        puissance4.bean.Validation.validationPort(port);
        assertTrue(Validation.ERREURS.containsKey("port"));
        puissance4.bean.Validation.afficheErreur();
    }
}