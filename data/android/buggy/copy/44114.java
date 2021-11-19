void addToInventory(Group_Project_Bork.Item item) {
    this.inventory.add(item);
    currentWeight = 0;
    for (Group_Project_Bork.Item current : inventory) {
        currentWeight += current.getWeight();
    }
}