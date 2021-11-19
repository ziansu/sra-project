public boolean inputsDisabled(org.openqa.selenium.WebElement element) {
    java.lang.Boolean inputState = false;
    this.scrollToElement(element);
    if (element.getAttribute("disabled").equals("true"))
        inputState = true;
    
    return inputState;
}