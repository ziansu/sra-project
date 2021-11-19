public int getSum() {
    int sum = 0;
    for (Item item : items) {
        sum += item.getPrice();
    }
    return sum;
}