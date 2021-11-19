private static java.lang.String getAttributeValue(org.openqa.selenium.WebElement element, java.lang.String attributeName, boolean trim) {
    java.lang.String attr = element.getAttribute(attributeName);
    return attr == null ? "" : trim ? attr.trim() : attr;
}