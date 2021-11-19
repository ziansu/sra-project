@org.testng.annotations.Test
public void testPageTitle() {
    java.lang.System.out.println(("Title of the page is: " + (apiDemosHome.title.getText())));
    org.testng.Reporter.log(("Title of the page is: " + (apiDemosHome.title.getText())));
    org.testng.Assert.assertEquals("API Demos", apiDemosHome.title.getText());
}