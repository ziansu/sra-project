@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void create_nullFile() throws java.lang.Exception {
    new xyz.enhorse.commons.parameters.TextFileLoader(null, java.nio.charset.StandardCharsets.UTF_8);
}