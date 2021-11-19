@java.lang.Override
public org.bukkit.inventory.ItemStack setUnbreakable(org.bukkit.inventory.ItemStack item) {
    org.bukkit.inventory.meta.ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
}