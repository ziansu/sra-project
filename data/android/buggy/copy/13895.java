@org.junit.After
public void cleanup() throws java.io.IOException {
    try {
        java.nio.file.Files.delete(shadow.test.output.OutputTests.executable);
    } catch (java.lang.Exception e) {
    }
}