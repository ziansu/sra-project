public void trackPlayerQuit(net.nyvaria.openanalytics.bukkit.client.Client client) {
    if ((is_tracking) && (client.isOptedIn()))
        net.nyvaria.openanalytics.bukkit.OpenAnalyticsTracker.mpClient.sendAsynchronously(client.createPlayerQuitHit());
    
}