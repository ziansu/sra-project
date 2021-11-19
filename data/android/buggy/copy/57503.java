public int removeAll(Adventure.Items.Item item) {
    int result = count.remove(inventory.indexOf(item));
    inventory.remove(item);
    resetWeight();
    return result;
}