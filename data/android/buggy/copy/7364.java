@org.testng.annotations.Test
public void testSaveScreenShot() throws java.io.IOException {
    org.ats.services.functional.Value file = new org.ats.services.functional.Value("/tmp/screen.png", false);
    org.ats.services.functional.action.SaveScreenShot saveScreenShot = new org.ats.services.functional.action.SaveScreenShot(file);
    java.lang.System.out.println(saveScreenShot.transform());
    org.testng.Assert.assertEquals(saveScreenShot.transform(), "wd.getScreenshotAs(FILE).renameTo(new File(\"/tmp/screen.png\"));\n");
}