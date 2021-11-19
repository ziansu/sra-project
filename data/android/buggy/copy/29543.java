@org.junit.Test
public void testMain() {
    Main.main(new java.lang.String[]{ "arg1" });
    org.junit.Assert.fail("Testing failed test");
}