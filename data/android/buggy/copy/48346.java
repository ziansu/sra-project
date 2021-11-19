public double setTotalAmountTextView() {
    double value = 0.0;
    for (APIResponse.CartPartDetail part : cartProductsList) {
        value = value + (java.lang.Double.valueOf(part.getShippingCharges()));
    }
    return value;
}