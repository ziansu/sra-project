public void printArrayOfBankAccounts() {
    java.lang.System.out.println(this.bankName);
    for (com.bankproject.wbk.bankAccount.Account account : bankAccountList) {
        java.lang.System.out.println(account.toString());
    }
}