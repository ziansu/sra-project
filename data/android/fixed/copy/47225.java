@java.lang.Override
protected void onResume() {
    super.onResume();
    mainContentRVAdapter.readDataFromDB(readListContent());
    rv_main_content.setAdapter(mainContentRVAdapter);
}