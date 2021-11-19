public mytown.datasource.Resident getOrMakeResident(net.minecraft.entity.player.EntityPlayer player) {
    return getOrMakeResident(player.getPersistentID(), player.getDisplayName());
}