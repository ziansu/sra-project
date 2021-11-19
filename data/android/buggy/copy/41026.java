@org.junit.Test(expected = org.yj.smtpstub.exception.InvalidStoreException.class)
public void testLoadIndexInvalidFile() throws org.yj.smtpstub.exception.InvalidStoreException {
    org.yj.smtpstub.configuration.Configuration.set("emails.storage.fs.indexfile", "");
    org.yj.smtpstub.storage.FSMailStore.loadIndex();
    fail("should have thrown an InvalidStoreException");
}