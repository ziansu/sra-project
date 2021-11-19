public void startListening() {
    for (org.bukkit.entity.Player player : game.getPlaying()) {
        if (!(joinedAt.containsKey(player)))
            joinedAt.put(player, java.lang.System.currentTimeMillis());
        
    }
    listen = true;
}