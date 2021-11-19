public void order(java.lang.String query) throws java.lang.Exception {
    com.password.manager.core.query.Query q = new com.password.manager.core.query.Query(query);
    objects = q.run(backupList);
    notifyDataSetChanged();
}