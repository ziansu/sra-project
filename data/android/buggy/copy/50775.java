private static void drop(org.bukkit.Location where, org.bukkit.inventory.Inventory container, boolean naturally) {
    for (org.bukkit.inventory.ItemStack item : container.getContents())
        com.gmail.zariust.otherdrops.drop.ContentsDrop.drop(where, item, naturally);
    
}