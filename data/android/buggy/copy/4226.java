void resetRulesRecyclerView() {
    if ((mItemTouchHelper) != null) {
        mItemTouchHelper.attachToRecyclerView(null);
        mItemTouchHelper = null;
    }
    mRulesRecyclerView.setAdapter(null);
    mRulesRecyclerView.setLayoutManager(null);
}