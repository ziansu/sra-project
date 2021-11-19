public boolean inputsDisabled(org.openqa.selenium.WebElement element) {
    java.lang.Boolean inputState = false;
    if (element.getAttribute("disabled").equals("true"))
        inputState = true;
    
    return inputState;
}