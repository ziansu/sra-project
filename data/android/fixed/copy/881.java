protected boolean onBoundingBoxActivated(net.minecraft.util.math.AxisAlignedBB boundingBox, sirttas.alchemytech.block.pipe.TileBrassPipe pipe, net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack heldItem) {
    net.minecraft.util.EnumFacing face = getFace(boundingBox);
    if (face != null) {
        return pipe.activatePipe(face);
    }
    return false;
}