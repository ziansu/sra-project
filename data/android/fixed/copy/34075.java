private void commit(java.util.ArrayList<java.lang.Integer> selectedIds) {
    android.content.Intent data = new android.content.Intent();
    data.putExtra(cwa115.trongame.FriendsListActivity.SELECTED_IDS_EXTRA, selectedIds);
    setResult(cwa115.trongame.RESULT_OK, data);
    finish();
}