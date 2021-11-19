@org.bukkit.event.EventHandler
public void serverListPing(org.bukkit.event.server.ServerListPingEvent event) {
    this.injectOpenConnections(event.getAddress());
    java.lang.System.out.println(("[PingAPI] Recived Ping from: " + (event.getAddress().getHostAddress())));
}