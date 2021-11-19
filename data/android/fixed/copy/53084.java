@java.lang.Override
public boolean apply(org.openqa.selenium.WebElement element) {
    return Html.text.contains(com.codeborne.selenide.Condition.getAttributeValue(element, "value", true), expectedValue);
}