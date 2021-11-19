private long findCurrentGameId(long userId) {
    com.telan.werewolf.game.process.Player player = memGameManager.getPlayerByUserId(userId, 0);
    if (player == null) {
        return findCurrentGameIdFromDB(userId);
    }
    return player.getGameId();
}