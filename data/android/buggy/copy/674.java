public void addPlayer(org.bukkit.entity.Player player) {
    if (allowedWorlds.get(player.getWorld().getName()))
        registeredPlayers.add(player);
    
}