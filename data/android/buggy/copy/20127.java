public boolean cardInserted(java.lang.String accountNum) {
    currAccount = ATM.theBank.validate(accountNum);
    return (this.account) != null;
}