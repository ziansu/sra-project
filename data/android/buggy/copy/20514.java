@org.mariadb.jdbc.Test
public void useSslForceTlsv11() throws java.lang.Exception {
    if ((!(isMariadbServer())) || (minVersion(5, 7))) {
        useSslForceTls("TLSv1.1");
    }
}