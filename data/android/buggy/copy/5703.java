@org.junit.Test
public void testUnionSatesfiesChildTest() {
    org.gradle.Privilege priv = new org.gradle.Privilege();
    org.gradle.Privilege priv2 = priv.union(new org.gradle.Privilege());
    assertTrue(priv.accepts(priv2));
}