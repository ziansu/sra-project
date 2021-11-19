public void clickSignIn() {
    try {
        findElementOnPage(org.openqa.selenium.By.xpath(test.java.pageobjects.AbstractPage.user_account_link_signin)).click();
    } catch (java.lang.Exception ex) {
        clickSignOut();
        clickSignIn();
    }
}