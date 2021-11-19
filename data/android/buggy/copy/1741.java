@org.junit.Test
public void testReceiveDamage() {
    player1.receiveDamage(10);
    assertEquals("recieveDamage error", 90, player1.getHealth());
}