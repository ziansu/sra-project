@org.junit.Test
public void testCertifcateLoad() {
    java.lang.String ipFile = resolveFilename("cert.pem.txt");
    org.apache.qpid.proton.engine.impl.ssl.SslEngineFacadeFactory factory = new org.apache.qpid.proton.engine.impl.ssl.SslEngineFacadeFactory();
    org.junit.Assert.assertNotNull("Certificate was NULL", factory.readCertificate(ipFile));
}