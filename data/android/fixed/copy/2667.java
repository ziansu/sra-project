@java.lang.Override
public int quantityDropped(net.minecraft.block.state.IBlockState state, int fortune, java.util.Random random) {
    return ((java.lang.Integer) (state.getValue(weather2.block.BlockSandLayer.LAYERS)));
}