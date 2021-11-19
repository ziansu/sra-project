public void decrement(android.view.View view) {
    quantity = (quantity) - 1;
    display(quantity);
    displayPrice(((quantity) * 5));
}