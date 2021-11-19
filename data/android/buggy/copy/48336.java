@org.testng.annotations.Test
public void saveImage() throws java.lang.Exception {
    java.io.InputStream image = org.apache.commons.io.IOUtils.toBufferedInputStream(dockerClient.saveImageCmd("busybox").exec());
    org.hamcrest.MatcherAssert.assertThat(image.available(), org.hamcrest.Matchers.greaterThan(0));
}