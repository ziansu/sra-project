public java.lang.String getAttribute(java.lang.String xpath, java.lang.String attribute) {
    org.openqa.selenium.WebElement el = getElement(xpath);
    java.lang.String value = el.getAttribute(attribute);
    return value;
}