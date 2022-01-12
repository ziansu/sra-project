@org.junit.Test
public void testMouseXpos() {
    assertNotNull(GameHUD.getMouseXpos());
    assertEquals(GameHUD.getMouseXpos(), GameHUDTest.mouseXpos);
}