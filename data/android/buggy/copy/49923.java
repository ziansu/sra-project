@org.junit.After
public void tearDown() throws java.lang.Exception {
    fileDb.close();
    if (file.exists()) {
        org.apache.commons.io.FileUtils.forceDelete(file);
    }
}