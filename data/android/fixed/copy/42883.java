public void setQuantity(int quantity) {
    if (quantity < 0)
        throw new java.lang.IllegalArgumentException(((("Please check the product quantity.  Product name: " + (this.name)) + "  Quantity: ") + quantity));
    
    this.quantity = quantity;
}