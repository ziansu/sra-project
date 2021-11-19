@java.lang.Override
protected void doBegin(java.lang.Object transaction, org.springframework.transaction.TransactionDefinition definition) {
    super.doBegin(transaction, definition);
    com.pla.transaction.SessionTransaction.set(((sessionFactoryName) == null ? "" : sessionFactoryName), this.getSessionFactory().getCurrentSession());
}