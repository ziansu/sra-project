@java.lang.Override
protected java.lang.Void doInBackground(bg.o.sim.finansizmus.model.User... params) {
    long id = user.getId();
    loadUserAccounts(id);
    loadUserCategories(id);
    loadUserTransactions(id);
    return null;
}