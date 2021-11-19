public double debit(double amount) {
    if ((balance) < amount) {
        amount = balance;
    }
    balance -= amount;
    return amount;
}