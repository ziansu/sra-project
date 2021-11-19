protected void add(java.util.List list, net.minecraft.item.Item item) {
    item.getSubItems(item, this, list);
}