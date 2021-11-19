@org.junit.Test
public void testIsMainline() {
    testNew();
    org.junit.Assert.assertFalse("lts.isMainline() false", lts.isMainline());
    org.junit.Assert.assertFalse("ltd.isMainline() false", ltd.isMainline());
}