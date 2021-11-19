@org.junit.Test
public void getExistingItem() {
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    skroll.n26test.model.Transaction recievedTransaction = skroll.n26test.TransactionService.getTransaction(TRANSACTION_ID);
    assertEquals("Objects not the same", transaction, recievedTransaction);
}