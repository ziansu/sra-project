public void addTransaction(com.abm.pos.ABMPos.dao.TransactionDao transactionDao) {
    transactionRepository.save(transactionDao);
}