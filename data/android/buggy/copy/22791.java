@org.junit.Test
public void _000AJustToWarmUpJVM01() throws java.lang.Throwable {
    helpers.TestHelper.configureForTest();
    facade.L42.main(new java.lang.String[]{ "examples/testsForAdamTowel01/UseAdamTowel01.L42" });
    org.junit.Assert.assertEquals(L42.record.toString(), "FreeTemplate\nFreeTemplate\nHello Adam 0\nazz\nbzz\nczz\n");
}