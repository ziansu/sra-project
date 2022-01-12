public org.fundacionjala.automation.framework.pages.tablet.settings.NavigationPage selectConferenceRoom(java.lang.String roomName) {
    org.openqa.selenium.WebElement room = getConferenceRoom(roomName);
    if (room != null) {
        room.click();
    }
    return this;
}