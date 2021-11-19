public static com.cartisan.modern.transaction.domain.summary.TransactionForSummary create(com.cartisan.modern.transaction.domain.Transaction transaction) {
    switch (transaction.getType()) {
        case Income :
            return new com.cartisan.modern.transaction.domain.summary.IncomeTransactionForSummary(transaction);
        case Outcome :
            return new com.cartisan.modern.transaction.domain.summary.OutcomeTransactionForSummary(transaction);
        default :
            throw new java.lang.IllegalStateException();
    }
}