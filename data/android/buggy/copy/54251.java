public void delete(pl.surreal.finance.transaction.core.Label label) {
    currentSession().delete(label);
    currentSession().flush();
}