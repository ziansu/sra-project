@java.lang.Override
public void setItem(int index, org.bukkit.inventory.ItemStack item) {
    this.items[index] = com.bergerkiller.bukkit.common.utils.ItemUtil.cloneItem(item);
}