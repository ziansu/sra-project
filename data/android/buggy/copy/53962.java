private void fireMultiplayerStatsChanged(java.util.ArrayList<multiplayer.PlayerDump> playerStats) {
    for (multiplayer.PlayerDump d : playerStats) {
        java.lang.System.out.println(d.toString());
    }
    for (multiplayer.client.view.MultiplayerStatsView view : multiplayerStatsViews) {
        view.statsChanged(playerStats);
    }
}