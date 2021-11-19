public void dropCurrent() {
    if ((Characters.Inventory.Inventory.inventoryBox.itemArray) != null)
        Characters.Inventory.Inventory.Items[Characters.Inventory.Inventory.currentCategory].Remove(Characters.Inventory.Inventory.inventoryBox.itemArray[Characters.Inventory.Inventory.inventoryBox.currentItem].getKey());
    
}