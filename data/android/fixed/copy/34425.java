@org.junit.AfterClass
public static void afterClass() throws java.io.IOException {
    if ((com.qwazr.search.test.units.AbstractIndexTest.indexManager) != null) {
        com.qwazr.search.test.units.AbstractIndexTest.indexManager.close();
        com.qwazr.search.test.units.AbstractIndexTest.indexManager = null;
    }
    if ((com.qwazr.search.test.units.AbstractIndexTest.rootDirectory) != null)
        com.qwazr.utils.FileUtils.deleteDirectoryQuietly(com.qwazr.search.test.units.AbstractIndexTest.rootDirectory);
    
}