@org.junit.Test
public void testIrisDataFetcher() throws java.lang.Exception {
    org.deeplearning4j.base.MnistFetcher mnistFetcher = new org.deeplearning4j.base.MnistFetcher();
    java.io.File mnistDir = mnistFetcher.downloadAndUntar();
    assert mnistDir.isDirectory();
}