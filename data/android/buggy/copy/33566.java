public boolean hasStock(int amount) {
    int newStock = (stock) - amount;
    return (newStock >= (minStock)) && (newStock <= (maxStock));
}