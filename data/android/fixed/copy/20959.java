@java.lang.Override
protected void setUpTaskList() {
    helper.beforeSetUpTaskList(filter);
    super.setUpTaskList();
    unregisterForContextMenu(getListView());
}