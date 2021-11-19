public void goGenerateList(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.zaccianflone.pantrypro.GenerateList.class);
    intent.putExtra(Constants.KEY_LIST_ID, mListId);
    arrayAdapter.clear();
    startActivity(intent);
}