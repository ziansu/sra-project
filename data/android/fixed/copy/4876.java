@org.junit.Test
public void testSetLevel() {
    test.setLevel(2);
    assertEquals("Level: 2", test.getLevelLabel().getText());
}