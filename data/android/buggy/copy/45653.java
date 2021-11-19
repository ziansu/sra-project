@java.lang.Override
public boolean apply(org.openqa.selenium.WebDriver input) {
    return getErrors().contains(expected);
}