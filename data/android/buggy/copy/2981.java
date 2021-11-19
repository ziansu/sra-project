private void addOnlinePlayers() {
    for (final org.bukkit.entity.Player p : plugin.getServer().getOnlinePlayers()) {
        add(p);
    }
}