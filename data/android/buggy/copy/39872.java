@cucumber.api.java.en.Then(value = "^I should see a list of products$")
public void I_should_see_a_list_of_products() throws java.lang.Throwable {
    org.hamcrest.MatcherAssert.assertThat(webDriver.findElement(org.openqa.selenium.By.id("productList")).getSize(), org.hamcrest.core.Is.is(org.hamcrest.core.IsNot.not(0)));
}