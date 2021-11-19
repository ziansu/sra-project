@java.lang.Override
protected void onStart() {
    super.onStart();
    spinnerFilter.setSelection(0);
    populateArrayItems(itemDb.getAllData());
}