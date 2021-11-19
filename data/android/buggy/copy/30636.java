public static boolean hasTracker(org.bukkit.entity.Player p) {
    return com.aetheriumwars.stickytracker.StickyTracker.getTrackers().containsKey(p.getUniqueId());
}