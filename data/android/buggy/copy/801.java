@org.junit.Test(expected = org.yj.smtpstub.exception.InvalidStoreException.class)
public void testGetMailStoreInvalidType() throws org.yj.smtpstub.exception.InvalidStoreException {
    java.lang.String type = "InvalidType";
    java.lang.Object obj = org.yj.smtpstub.storage.MailStoreFactory.getMailStore(type);
}