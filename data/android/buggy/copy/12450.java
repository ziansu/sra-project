@org.junit.Before
public void setUp() throws java.lang.Exception {
    handler = new com.github.fishio.logging.TxtFileHandler(folder.newFile("test.txt"));
}