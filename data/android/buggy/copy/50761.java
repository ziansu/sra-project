@org.junit.Test
public void matchVersion() throws java.lang.Exception {
    org.junit.Assert.assertEquals(_dbVersionInfo.getSchemaVersion(), "2.2");
    org.junit.Assert.assertEquals(_dbVersionInfo.getSchemaVersion(), service.getVersion());
}