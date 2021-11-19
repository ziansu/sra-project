@java.lang.Override
public void onContainerClosed(net.minecraft.entity.player.EntityPlayer playerIn) {
    tile.voidPlayerUsing();
    super.onContainerClosed(playerIn);
}