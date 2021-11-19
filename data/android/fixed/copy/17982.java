private java.security.cert.X509Certificate createCertificate(java.lang.String name, final java.util.Date notBefore, final java.util.Date notAfter) {
    java.security.KeyPair keypair = org.apache.ace.authentication.processor.clientcert.ClientCertAuthenticationProcessorTest.m_keystore.generateKeyPair();
    return org.apache.ace.authentication.processor.clientcert.ClientCertAuthenticationProcessorTest.m_keystore.createCertificate(("cn=" + name), notBefore, notAfter, keypair.getPublic());
}