@org.junit.Before
public void setUp() {
    apps.tests.Log4JFixture.setUp();
    tc = new jmri.jmrix.ieee802154.xbee.XBeeInterfaceScaffold();
    jmri.util.JUnitAppender.assertErrorMessage("Deprecated Method setInstance called");
}