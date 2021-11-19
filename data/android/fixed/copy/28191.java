void removeFromInventory(Group_Project_Bork.Item item) {
    this.inventory.remove(item);
    currentWeight -= item.getWeight();
}