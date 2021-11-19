public double getSubTotal(java.util.ArrayList<softparkmulti.Transaction> transactions) {
    double subTotal = 0;
    for (softparkmulti.Transaction t : transactions) {
        subTotal += t.getMaxAmount();
    }
    return subTotal;
}