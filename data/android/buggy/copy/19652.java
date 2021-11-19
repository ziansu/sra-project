@org.junit.Test
public void testLoad() {
    org.junit.Assert.assertTrue(org.semux.Config.init());
    org.junit.Assert.assertEquals(1, Config.NETWORK_ID);
}