@org.junit.Test
public void testGetDisplayName() {
    testNew();
    org.junit.Assert.assertEquals(lts.getDisplayName(), "Slip single");
    org.junit.Assert.assertEquals(ltd.getDisplayName(), "Slip double");
}