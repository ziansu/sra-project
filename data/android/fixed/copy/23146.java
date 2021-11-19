public void setNumberToOrderToDefault() {
    if (((highestNumberInInventory) - (numberInStock)) <= 0) {
        this.numberToOrder = 1;
    }else {
        this.numberToOrder = (highestNumberInInventory) - (numberInStock);
    }
}