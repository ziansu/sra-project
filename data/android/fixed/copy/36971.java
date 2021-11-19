@java.lang.Override
public void run() {
    plugin.getGrid().homeTeleport(player);
    plugin.getPlayers().setInTeleport(player.getUniqueId(), false);
}