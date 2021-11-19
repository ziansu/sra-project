public void sendNBTToGui(net.minecraft.nbt.NBTTagCompound nbt) {
    com.creativemd.creativecore.common.packet.PacketHandler.sendPacketToPlayer(new com.creativemd.creativecore.common.packet.gui.GuiNBTPacket(nbt), ((net.minecraft.entity.player.EntityPlayerMP) (player)));
}