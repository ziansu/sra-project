@org.junit.Test(expected = java.lang.RuntimeException.class)
public void malformedASTShouldThrowException() throws java.lang.Exception {
    java.nio.file.Path home_dir = java.nio.file.Paths.get("resources/python/malformed_subset/");
    java.lang.System.out.print(new TreeEditDistanceArray(home_dir, "python").compute());
}