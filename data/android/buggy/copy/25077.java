@org.junit.Test(expected = org.yj.smtpstub.exception.InvalidStoreException.class)
public void testGetMailStoreNullType() throws org.yj.smtpstub.exception.InvalidStoreException {
    java.lang.String type = null;
    org.yj.smtpstub.storage.MailStoreFactory.getMailStore(type);
    org.junit.Assert.fail("should have thrown an exception");
}