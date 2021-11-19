@java.lang.Override
public org.openqa.selenium.WebElement findElementByTagName(java.lang.String tagName) {
    java.util.List<org.openqa.selenium.WebElement> list = byTagName(tagName);
    return list.isEmpty() ? null : list.get(0);
}