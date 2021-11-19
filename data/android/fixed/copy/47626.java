public static boolean startServer() throws java.lang.Exception {
    if (io.undertow.server.security.KerberosKDCUtil.initialised) {
        return false;
    }
    io.undertow.server.security.KerberosKDCUtil.setupEnvironment();
    io.undertow.server.security.KerberosKDCUtil.startLdapServer();
    io.undertow.server.security.KerberosKDCUtil.startKDC();
    io.undertow.server.security.KerberosKDCUtil.initialised = true;
    return true;
}