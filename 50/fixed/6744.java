private boolean isPlayerTurn(edu.jhu.clueless.Player player) {
    return player.getSuspect().equals(edu.jhu.clueless.Game.SUSPECT_ORDER[indexPlayerTurn]);
}