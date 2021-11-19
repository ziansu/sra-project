public static <T> T initElements(org.imaginea.test.automation.framework.pagemodel.Browser browser, T pageClassObjectToProxy) {
    org.openqa.selenium.support.pagefactory.ElementLocatorFactory locatorFactory = new org.imaginea.test.automation.framework.locator.pagefactory.SimpleLocatorFactory(browser);
    org.imaginea.test.automation.framework.locator.CustomPageFactory.initElements(browser, locatorFactory, pageClassObjectToProxy);
    return pageClassObjectToProxy;
}