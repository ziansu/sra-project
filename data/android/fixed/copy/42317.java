@org.junit.Test
public void testWithoutOption() throws alluxio.exception.AlluxioException, java.io.IOException {
    mFileSystem.createDirectory(new alluxio.AlluxioURI("/testDir"));
    int ret = mFsShell.run("test", "/testDir");
    org.junit.Assert.assertEquals((-1), ret);
}