public void addButton(int position, com.Ben12345rocks.AdvancedCore.Util.Inventory.BInventoryButton button) {
    if (position >= 54) {
        position = 53;
    }
    getButtons().put(position, button);
}