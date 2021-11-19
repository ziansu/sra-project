public static me.lucko.helper.serialize.BlockPosition of(org.bukkit.Location location) {
    return me.lucko.helper.serialize.BlockPosition.of(location.getBlockX(), location.getBlockY(), location.getBlockZ(), location.getWorld().getName()).setBukkitLocation(location);
}