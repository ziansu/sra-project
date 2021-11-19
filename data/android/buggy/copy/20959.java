@java.lang.Override
protected void setUpTaskList() {
    helper.beforeSetUpTaskList(filter);
    java.lang.System.err.println(("sql: " + (filter.sqlQuery)));
    super.setUpTaskList();
    unregisterForContextMenu(getListView());
}