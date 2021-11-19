private static java.lang.String getAttributeValue(org.openqa.selenium.WebElement element, java.lang.String attributeName) {
    java.lang.String attr = element.getAttribute(attributeName);
    return attr == null ? "" : attr.trim();
}