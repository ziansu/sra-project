@java.lang.Override
public int[] getSlotsForFace(net.minecraft.util.EnumFacing side) {
    return side == (net.minecraft.util.EnumFacing.DOWN) ? dmf444.ExtraFood.Common.blocks.tileentity.TileEntityOven.slots_bottom : null;
}