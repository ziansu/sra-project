@java.lang.Override
public void channelClosed(jsettlers.network.server.match.Player player) {
    if (player.isInMatch()) {
        try {
            player.leaveMatch();
        } catch (java.lang.IllegalStateException e) {
            assert false : "This may never happen here!";
        }
    }
    database.removePlayer(player);
}