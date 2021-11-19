@org.junit.Test
public void testJsonGzip() throws java.lang.Exception {
    java.net.URL url = getClass().getResource("repo.json");
    url = gzip(url);
    org.apache.karaf.features.internal.repository.JsonRepository repo = new org.apache.karaf.features.internal.repository.JsonRepository(url.toExternalForm());
    verify(repo);
}