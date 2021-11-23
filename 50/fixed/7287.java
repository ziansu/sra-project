@org.junit.Before
public void setUp() throws java.lang.Exception {
    _inn = new chronos.pdc.buildings.Inn(fakeNpcRegistry);
    org.junit.Assert.assertNotNull(_inn);
    _inn.setBusinessHours(TEST_OPEN, TEST_CLOSING);
}