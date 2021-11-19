public org.bukkit.entity.Player getPlayer(java.util.UUID pid) {
    if (org.freehat.particles.ParticlesPlugin.AI.equals(pid)) {
        return aiPlayer;
    }else {
        return org.bukkit.Bukkit.getPlayer(pid);
    }
}