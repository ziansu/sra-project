public void setPlayer(net.minecraft.entity.player.EntityPlayer player) {
    this.player = player;
    if (player != null)
        playerName = player.getName();
    
    markDirty();
}