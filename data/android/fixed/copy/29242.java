@org.junit.Test
public void testResetUserAnonymous() {
    java.lang.String id = lqd.getUserIdentifier();
    lqd.resetUser();
    org.junit.Assert.assertEquals(id, lqd.getUserIdentifier());
}