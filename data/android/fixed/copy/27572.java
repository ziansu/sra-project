public static void navigateToTestingFolder(io.appium.java_client.android.AndroidDriver driver) {
    com.amaze.filemanager.test.Utilities.Utils.openDrawer(driver);
    com.amaze.filemanager.test.Utilities.Utils.findElementByName(driver, com.amaze.filemanager.test.Utilities.Utils.storageText).click();
    com.amaze.filemanager.test.Utilities.Utils.searchInVisibleListWithName(driver, com.amaze.filemanager.test.Utilities.Utils.generalTestingFolder).click();
}