public static co.cask.tephra.TransactionFailureException asTransactionFailure(java.lang.Throwable t) {
    if (t instanceof co.cask.tephra.TransactionFailureException) {
        return ((co.cask.tephra.TransactionFailureException) (t));
    }
    return new co.cask.tephra.TransactionFailureException(("Exception raised in transactional execution. Cause: " + (t.getMessage())), t);
}