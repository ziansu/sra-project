@java.lang.SuppressWarnings(value = "PMD")
@org.junit.Test
public void securityTest6() {
    request = makeRequest(6, nc.sumy.edu.webcontainer.sequrity.ServerSecurityTest.IP_VAR1, nc.sumy.edu.webcontainer.sequrity.ServerSecurityTest.NC_COM);
    nc.sumy.edu.webcontainer.sequrity.ServerSecurity serverSecurity = new nc.sumy.edu.webcontainer.sequrity.ServerSecurity(request, serverConfiguration);
    org.junit.Assert.assertEquals(serverSecurity.isAllow(), true);
}