public bool addToInventory(Item item) {
    if ((item.getSize()) > (getInventoryFree()));
    {
        return false;
    }
    inventoryItems.add(item);
    return true;
}