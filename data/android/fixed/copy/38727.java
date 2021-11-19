@java.lang.Override
protected void onResume() {
    super.onResume();
    contactsListView.update();
    callLogListView.update();
}