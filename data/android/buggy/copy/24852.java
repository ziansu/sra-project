double calculateTotal() {
    subtotal = calculateSubtotal();
    tax = calculateTax();
    total = (tax) + (subtotal);
    return total;
}