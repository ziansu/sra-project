static int getRandomPlayerTurnOrder() {
    return com.forerunnergames.tools.common.Randomness.getRandomElementFrom(com.forerunnergames.peril.client.ui.screens.game.play.modes.classic.debug.DebugEventGenerator.VALID_SORTED_PLAYER_TURN_ORDERS);
}