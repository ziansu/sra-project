@org.junit.Test
public void testEndGame() {
    assertEquals(1001, myGameStateDAO.endGame(1, 1).getUid());
}