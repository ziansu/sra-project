@java.lang.Override
public void playMusic(com.intellectualcrafters.plot.object.Location location, int id) {
    this.player.playEffect(com.plotsquared.bukkit.util.BukkitUtil.getLocation(location), Effect.RECORD_PLAY, org.bukkit.Material.getMaterial(id));
}