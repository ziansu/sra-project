public java.util.List<no.runsafe.framework.api.player.IPlayer> getOfflinePlayers() {
    return no.runsafe.framework.internal.wrapper.ObjectWrapper.convert(((org.bukkit.OfflinePlayer[]) (server.getOfflinePlayers())));
}