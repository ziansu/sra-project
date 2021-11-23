@org.testng.annotations.Test
public void test1024Mb() throws java.lang.Exception {
    smartAssert((1L << 30), "1024Mb");
}