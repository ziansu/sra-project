@java.lang.Override
protected void done() {
    ListViewGui listView = new ListViewGui(resultList);
    listView.setVisible(true);
    searchProcessBar.setValue(0);
}