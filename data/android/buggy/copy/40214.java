@java.lang.Override
public boolean canRenderInLayer(net.minecraft.block.state.IBlockState state, net.minecraft.util.BlockRenderLayer layer) {
    return (layer == (net.minecraft.util.BlockRenderLayer.CUTOUT)) || (layer == (net.minecraft.util.BlockRenderLayer.TRANSLUCENT));
}