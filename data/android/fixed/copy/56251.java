public void placeBlock(net.glowstone.entity.GlowPlayer player, net.glowstone.block.GlowBlockState state, org.bukkit.block.BlockFace face, org.bukkit.inventory.ItemStack holding, java.util.Vector clickedLoc) {
    state.setType(holding.getType());
    state.setData(holding.getData());
}