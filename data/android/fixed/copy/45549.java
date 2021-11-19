public boolean transfer(client.Bank bank, java.lang.String toAccount, int money) {
    return bank.transfer(getAccountNumber(bank), toAccount, money);
}