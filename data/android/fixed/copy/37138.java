@org.junit.Test
public void runHelloWorldTest() throws java.lang.Exception {
    learnsomejava.Buggy buggy = new learnsomejava.Buggy();
    org.junit.Assert.assertEquals("Hello World", buggy.getHelloWorld());
}