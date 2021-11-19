public void setDestinationAccount(account.Account destinationAccount) throws transaction.InvalidAccountException {
    if (destinationAccount == null)
        throw new transaction.InvalidAccountException("The destination account cannot be null!");
    
    this.destinationAccount = destinationAccount;
    this.accounts.add(1, destinationAccount);
}