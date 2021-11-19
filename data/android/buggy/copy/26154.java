public void onPlayerLogout(final org.bukkit.entity.Player player) {
    final java.util.UUID userId = com.lenis0012.bukkit.loginsecurity.util.ProfileUtil.getUUID(player);
    com.lenis0012.bukkit.loginsecurity.session.CollisionE activeSessions;
    remove(userId);
}