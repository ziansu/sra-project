public static int fromPlayerInventory(org.bukkit.inventory.PlayerInventory inv) {
    int armorPoints = 0;
    for (org.bukkit.inventory.ItemStack item : inv.getArmorContents())
        armorPoints += org.mctourney.autoreferee.util.ArmorPoints.fromItemStack(item);
    
    return armorPoints;
}