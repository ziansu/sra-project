@org.junit.After
public void tearDown() throws java.lang.Exception {
    ZimbraLog.test.debug("TestTags.tearDown()");
    cleanUp();
    com.zimbra.cs.db.DbPool.quietClose(mConn);
}