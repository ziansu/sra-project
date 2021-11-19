@org.testng.annotations.Test(dataProvider = "underlined")
public void testUnderlined(java.lang.String test, java.lang.String expect) {
    java.lang.String result = org.sothis.core.util.StringUtils.underlined(test);
    org.testng.Assert.assertEquals(result, expect);
}