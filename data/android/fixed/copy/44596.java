public void deleteById(java.lang.Long id) {
    pl.surreal.finance.transaction.core.Label label = ((pl.surreal.finance.transaction.core.Label) (currentSession().load(pl.surreal.finance.transaction.core.Label.class, id)));
    currentSession().delete(label);
}