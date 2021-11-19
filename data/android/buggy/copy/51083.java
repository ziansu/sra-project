private boolean shouldShowBoxAndPagesAnimation() {
    return (getPostListType().isTagType()) || ((getPostListType()) == (org.wordpress.android.ui.reader.ReaderTypes.ReaderPostListType.SEARCH_RESULTS));
}