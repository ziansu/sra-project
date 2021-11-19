@org.testng.annotations.Test
public void shouldReturnFinishedGame() {
    com.blackship.battlesheep.game.state.FinishedGameState givenFinishedGameState = new com.blackship.battlesheep.game.state.FinishedGameState("", null, null);
    org.testng.Assert.assertEquals(givenFinishedGameState.changeState(null, null).getClass(), com.blackship.battlesheep.game.state.FinishedGameState.class);
}