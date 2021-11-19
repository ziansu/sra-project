public boolean addItemToInventory(entity.item.Item item, java.lang.String key) {
    if (item.equals(null)) {
        throw new java.lang.NullPointerException("Item can't be null");
    }
    inventory.add(item);
    return true;
}