public synchronized boolean stand(CardGame.User user) {
    CardGame.GameEngine.Player player = getPlayer(user);
    player.setFinishedRound(true);
    return true;
}