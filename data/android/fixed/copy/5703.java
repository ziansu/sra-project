@org.junit.Test
public void testUnionSatesfiesChildTest() {
    org.gradle.Privilege priv = new org.gradle.Privilege();
    org.gradle.Privilege priv2 = org.gradle.Privilege.union(new org.gradle.Privilege[]{ priv , new org.gradle.Privilege() });
    assertTrue(priv.accepts(priv2));
}