public boolean hasPermission(org.bukkit.entity.Player player, java.lang.String node) {
    return ((player.hasPermission(node)) || (player.isOp())) || (player.hasPermission(node.toLowerCase()));
}