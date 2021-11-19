@java.lang.Override
public net.minecraft.item.ItemStack getPickBlock(net.minecraft.block.state.IBlockState state, net.minecraft.util.math.RayTraceResult target, net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.entity.player.EntityPlayer player) {
    return new net.minecraft.item.ItemStack(techreborn.init.ModBlocks.PLAYER_DETECTOR, 1, techreborn.blocks.BlockPlayerDetector.typeNamesList.indexOf(state.getValue(TYPE)));
}