public void order(com.password.manager.core.query.Query query) throws java.lang.Exception {
    objects = query.run(backupList);
    notifyDataSetChanged();
}