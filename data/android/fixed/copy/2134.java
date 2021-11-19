private net.minecraft.block.state.IBlockState getOre(net.teamio.taam.Taam.BLOCK_ORE_META ore) {
    return TaamMain.blockOre.getDefaultState().withProperty(BlockOre.VARIANT, ore);
}