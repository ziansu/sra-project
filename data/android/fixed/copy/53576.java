public static co.cask.tephra.TransactionFailureException asTransactionFailure(java.lang.Throwable t, java.lang.String message) {
    if (t instanceof co.cask.tephra.TransactionFailureException) {
        return ((co.cask.tephra.TransactionFailureException) (t));
    }
    return new co.cask.tephra.TransactionFailureException(message, t);
}