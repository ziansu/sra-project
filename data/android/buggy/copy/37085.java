public void spawn(org.bukkit.Location spawnLocation) {
    this.spawnLocation = spawnLocation;
    this.entity = ((org.bukkit.entity.LivingEntity) (spawnLocation.getWorld().spawnEntity(spawnLocation, type)));
    this.entity.setAI(false);
}