public void onUpButtonFloorChanged(long itemId, com.example.xyzreader.ui.ArticleDetailFragment fragment) {
    if (itemId == (mSelectedItemId)) {
        mSelectedItemUpButtonFloor = fragment.getUpButtonFloor();
        updateUpButtonPosition();
    }
}