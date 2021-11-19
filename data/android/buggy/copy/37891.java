public void decrement(android.view.View view) {
    int numberOfCoffees = (quantity) - 1;
    (quantity)--;
    if (numberOfCoffees < 0) {
        quantity = 0;
        numberOfCoffees = 0;
    }
    display(numberOfCoffees);
}