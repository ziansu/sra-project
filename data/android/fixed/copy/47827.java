public com.github.tnerevival.core.inventory.TNEInventory getInventory(java.util.UUID player) {
    if ((getInventoryID(player)) == null)
        return null;
    
    return inventories.get(getInventoryID(player));
}