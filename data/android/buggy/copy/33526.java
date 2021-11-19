@org.junit.Test
public void testWrongOption() throws java.lang.Exception {
    mFileSystem.createDirectory(new alluxio.AlluxioURI("/testDir"));
    int ret = mFsShell.run("test", "-dfesz", "/testDir");
    org.junit.Assert.assertEquals(1, ret);
}