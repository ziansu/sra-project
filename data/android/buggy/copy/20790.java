public void clickRoleRadioButton(com.softserveinc.edu.ita.enums.Roles roleName) {
    driver.findElement(org.openqa.selenium.By.xpath(java.lang.String.format(NewUserPageLocators.ROLE_SELECT, roleName.ordinal()))).click();
}