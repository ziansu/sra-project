@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.v("onResume", "-------onResume");
    mainContentRVAdapter.readDataFromDB(readListContent());
    rv_main_content.setAdapter(mainContentRVAdapter);
}