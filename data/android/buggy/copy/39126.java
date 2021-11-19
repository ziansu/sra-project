@org.junit.Test
public void testThatClosingTheCurrentWindowInvokesCorrectWebDriverMethods() {
    org.openqa.selenium.WebDriver.TargetLocator locator = mockTargetLocator();
    cut.closeCurrentWindow();
    org.mockito.Mockito.verify(webDriver).close();
    org.mockito.Mockito.verify(locator).defaultContent();
}