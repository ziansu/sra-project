protected static boolean containsText(com.codeborne.selenide.SelenideElement elementToFindText, java.lang.String textToFind) {
    return elementToFindText.has(com.codeborne.selenide.Condition.text(textToFind));
}