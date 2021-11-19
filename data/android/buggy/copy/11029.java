public static void Dispatch(net.minecraft.entity.player.EntityPlayerMP Player) {
    if (Player.worldObj.isRemote)
        return ;
    
    net.minecraft.nbt.NBTTagCompound Packet = new net.minecraft.nbt.NBTTagCompound();
    Packet.setInteger("MotionDuration", RiMConfiguration.CarriageMotion.MotionDuration);
    me.planetguy.remaininmotion.network.PacketManager.SendPacketToPlayer(Player, PacketTypes.SpecterVelocity, Packet);
}