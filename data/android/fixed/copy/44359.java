private void save() {
    if (((inventory) != null) && ((inventory) instanceof buildcraftAdditions.inventories.InventoryItem))
        ((buildcraftAdditions.inventories.InventoryItem) (inventory)).writeToNBT();
    
}