@org.junit.Before
public void setUp() throws java.lang.Exception {
    project = java.nio.file.Files.createTempDirectory("BBCNews_");
    testSubject = new tw.edu.ncu.CJ102.CoreProcess.BBCNewsPopulator(project);
}