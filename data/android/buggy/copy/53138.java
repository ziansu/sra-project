public mytown.datasource.Resident getOrMakeResident(net.minecraft.command.ICommandSender sender) {
    if (sender instanceof net.minecraft.entity.player.EntityPlayer) {
        return getOrMakeResident(((net.minecraft.entity.player.EntityPlayer) (sender)));
    }
    return null;
}