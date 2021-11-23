public void move(int amount, Adventure.Items.Item item, Adventure.Items.Inventory to) {
    if (to.add(amount, item)) {
        remove(amount, item);
    }
}