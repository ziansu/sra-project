public void logout() {
    menuDiv.click();
    waitUntilAppears(logoutDiv);
    logoutDiv.click();
}