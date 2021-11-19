@java.lang.Override
public org.bukkit.inventory.ItemStack[] getContents() {
    return com.bergerkiller.bukkit.common.utils.ItemUtil.cloneItems(this.items);
}