@java.lang.Override
public boolean canInteractWith(net.minecraft.entity.player.EntityPlayer playerIn) {
    return tileEntityHenhouse.isUsableByPlayer(playerIn);
}