public void resume() {
    player.resume();
    broadcast(Player.RESUMED_TRACK);
    pushSystemNotification();
}