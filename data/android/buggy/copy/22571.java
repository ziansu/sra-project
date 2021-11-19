@java.lang.Override
public boolean canHandlePacketAlready(pneumaticCraft.common.network.PacketUpdateGui message, net.minecraft.entity.player.EntityPlayer player) {
    return (player.openContainer) instanceof pneumaticCraft.common.inventory.ContainerPneumaticBase;
}