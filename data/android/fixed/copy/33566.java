public boolean hasStock(int amount) {
    int newStock = (this.stock) - amount;
    return (newStock >= (this.minStock)) && (newStock <= (this.maxStock));
}