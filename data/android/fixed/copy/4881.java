@java.lang.Override
public boolean playerHas(org.bukkit.entity.Player player, java.lang.String permission) {
    return this.permission.has(player, permission);
}