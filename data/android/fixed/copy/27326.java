private org.bukkit.inventory.ItemStack getFirstIngredient(org.bukkit.inventory.CraftingInventory inv) {
    for (org.bukkit.inventory.ItemStack i : inv.getMatrix()) {
        if ((i != null) && ((i.getType()) != (org.bukkit.Material.AIR)))
            return i;
        
    }
    return null;
}