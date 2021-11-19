protected void add(java.util.List list, net.minecraft.block.Block block) {
    block.getSubBlocks(net.minecraft.item.Item.getItemFromBlock(block), this, list);
}