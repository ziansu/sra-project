public void testHelpTaskDone() {
    main.execute("help");
    org.testfx.util.WaitForAsyncUtils.waitForFxEvents();
    org.junit.Assert.assertEquals(true, main.helpContent.isVisible());
}