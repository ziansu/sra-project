public java.lang.String getAttribute(java.lang.String xpath, java.lang.String attribute) {
    org.openqa.selenium.WebElement element = getElement(xpath);
    java.lang.String value = element.getAttribute(attribute);
    return value;
}