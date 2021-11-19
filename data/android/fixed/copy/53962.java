private void fireMultiplayerStatsChanged(java.util.ArrayList<multiplayer.PlayerDump> playerStats) {
    for (multiplayer.client.view.MultiplayerStatsView view : multiplayerStatsViews) {
        view.statsChanged(playerStats);
    }
}