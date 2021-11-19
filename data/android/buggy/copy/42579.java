public boolean setAdmin(net.minecraft.entity.player.EntityPlayer player) {
    if ((players[0]) == null) {
        players[0] = player;
        return true;
    }else
        return false;
    
}