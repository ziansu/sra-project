@org.junit.Test(expected = org.yj.smtpstub.exception.InvalidStoreException.class)
public void testLoadIndexNoJSONFile() throws org.yj.smtpstub.exception.InvalidStoreException {
    org.yj.smtpstub.configuration.Configuration.set("emails.storage.fs.indexfile", getResourceFile("/invalid_index.json"));
    org.yj.smtpstub.storage.FSMailStore.loadIndex();
}