public boolean isDebugging(org.bukkit.entity.Player target) {
    synchronized(debug) {
        return debug.contains(target);
    }
}