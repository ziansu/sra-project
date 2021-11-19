@org.junit.Test
public void testGetPlayersFromDatabase() {
    assertNotNull(database.MlbPlayer.getPlayersFromDatabase("", "", ""));
}