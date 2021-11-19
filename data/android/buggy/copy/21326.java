@org.junit.After
public void tearDown() {
    jmri.util.JUnitUtil.resetInstanceManager();
    apps.tests.Log4JFixture.tearDown();
    tc = null;
}