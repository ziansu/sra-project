public static reservaCanchas.common.server.Server getServer() {
    java.lang.String serverUrl = reservaCanchas.common.Config.getConfig().getProperty("server.url");
    return new reservaCanchas.common.server.Server(serverUrl);
}