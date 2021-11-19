@java.lang.Override
public boolean apply(org.openqa.selenium.WebElement element) {
    return expectedAttributeValue.equals(com.codeborne.selenide.Condition.getAttributeValue(element, attributeName, trim));
}