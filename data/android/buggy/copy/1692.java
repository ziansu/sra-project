@org.auraframework.integration.test.ExcludeBrowsers(value = org.auraframework.test.util.WebDriverUtil.BrowserType.GOOGLECHROME)
@org.junit.Test
public void testAttributesInitialization() throws java.lang.Exception {
    verifyAttributesInitialization(defaultStubCmp);
}