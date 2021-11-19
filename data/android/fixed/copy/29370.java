@org.junit.After
public void tearDown() throws java.lang.Exception {
    if ((layoutEditor) != null) {
        layoutEditor.dispose();
    }
    jmri.util.JUnitUtil.resetInstanceManager();
    apps.tests.Log4JFixture.tearDown();
}