private de.mca.model.interfaces.IsPlayer getPlayerOpponent(de.mca.model.interfaces.IsPlayer player) {
    return player.equals(PlayerType.HUMAN) ? getPlayerComputer() : getPlayerHuman();
}