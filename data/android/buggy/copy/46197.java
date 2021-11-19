public org.fluentlenium.assertj.custom.FluentWebElementAssert hasNotText(final java.lang.String textToFind) {
    java.lang.String actualText = actual.text();
    if (actualText.contains(textToFind)) {
        failWithMessage(("The element contain the text: " + textToFind));
    }
    return this;
}