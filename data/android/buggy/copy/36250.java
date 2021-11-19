public void increment(android.view.View view) {
    if ((quantity) == 99) {
        android.widget.Toast.makeText(this, "You can not order more than 99 cups of coffee", Toast.LENGTH_SHORT).show();
    }
    quantity = (quantity) + 1;
    display(quantity);
}