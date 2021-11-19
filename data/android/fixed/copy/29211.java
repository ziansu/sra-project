private static void resetSystemEnvVariables() {
    java.lang.System.clearProperty("java.security.krb5.conf");
    java.lang.System.clearProperty("sun.security.krb5.debug");
    java.lang.System.clearProperty("zookeeper.authProvider.1");
    java.lang.System.clearProperty("zookeeper.kerberos.removeHostFromPrincipal");
    java.lang.System.clearProperty("zookeeper.kerberos.removeRealmFromPrincipal");
}