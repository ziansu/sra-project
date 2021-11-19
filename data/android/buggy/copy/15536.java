@java.lang.Override
public void resetPlayer(final org.bukkit.entity.Player player, final boolean soft, final boolean force) {
    if (!soft) {
        remove(player, force);
    }
}