@org.junit.Test
public void testSetIsDead() {
    p.setIsDead(true);
    assertTrue(p.isDead());
    p.setIsDead(false);
    assertFalse(p.isDead());
}