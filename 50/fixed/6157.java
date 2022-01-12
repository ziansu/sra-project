@java.lang.Override
public int getMetaFromState(net.minecraft.block.state.IBlockState state) {
    return (variant) == null ? 0 : state.getValue(variant).ordinal();
}