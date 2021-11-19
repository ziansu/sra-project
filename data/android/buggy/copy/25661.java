public void loan(client.Bank bank, int money) {
    bank.loan(getAccountNumber(bank), money);
    this.asset += money;
}