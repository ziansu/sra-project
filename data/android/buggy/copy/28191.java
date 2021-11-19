void removeFromInventory(Group_Project_Bork.Item item) {
    this.inventory.remove(item);
    currentWeight = 0;
    for (Group_Project_Bork.Item current : inventory) {
        currentWeight += current.getWeight();
    }
}