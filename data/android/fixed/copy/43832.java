@java.lang.Override
protected void terminateTransactionsForValidUser(java.lang.String username) {
    if (failTerminateTransactions) {
        throw new java.lang.RuntimeException("Unexpected error");
    }
}