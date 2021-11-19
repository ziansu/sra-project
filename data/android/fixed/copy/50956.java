@org.junit.Test
public void addNewType() {
    transactionService.addTransaction(TRANSACTION_ID, transaction);
    assertTrue(transactionService.getIdsForType(TYPE).contains(TRANSACTION_ID));
}