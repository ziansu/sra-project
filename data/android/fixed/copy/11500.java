public void updateUI(com.handup.handup.model.Content c) {
    if ((mRecyclerViewAdapter) != null) {
        mRecyclerViewAdapter.addItem(c);
        mRecyclerViewAdapter.notifyDataSetChanged();
    }
}