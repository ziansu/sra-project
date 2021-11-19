@org.junit.Test
public void amountSet() {
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    skroll.n26test.model.Transaction transaction = skroll.n26test.TransactionService.getTransaction(TRANSACTION_ID);
    assertEquals(AMOUNT, transaction.getAmount(), DELTA);
}