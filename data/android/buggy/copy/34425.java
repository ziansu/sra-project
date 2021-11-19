@org.junit.AfterClass
public static void afterClass() throws java.io.IOException {
    com.qwazr.search.test.units.AbstractIndexTest.indexManager.close();
    com.qwazr.utils.FileUtils.deleteDirectoryQuietly(com.qwazr.search.test.units.AbstractIndexTest.rootDirectory);
}