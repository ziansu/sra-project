@org.junit.Test
public void testPlayerUnableToReachLimit() {
    Player testPlayer = new Player("noman", 5);
    int bet = 5;
    boolean testResult = testPlayer.balanceExceedsLimitBy(bet);
    assertEquals(false, testResult);
}