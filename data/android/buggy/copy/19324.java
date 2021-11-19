@java.lang.Override
public java.lang.String getSelectedValue() {
    waitUntilVisible();
    net.serenitybdd.core.pages.Select select = new net.serenitybdd.core.pages.Select(getElement());
    return select.getFirstSelectedOption().getAttribute("value");
}