private tterrag.customthings.common.config.json.BlockType getType(net.minecraft.world.IBlockAccess world, int x, int y, int z) {
    int meta = world.getBlockMetadata(x, y, z);
    return block.getType(meta);
}