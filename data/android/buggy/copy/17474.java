@java.lang.Override
public void bookmarkSelected(int position) {
    com.duckduckgo.mobile.android.duckduckgo.ui.bookmarks.BookmarkModel bookmarkModel = bookmarks.get(position);
    if (isEditing) {
        bookmarksView.showEditBookmark(bookmarkModel);
    }else {
        bookmarksView.resultOpenBookmark(bookmarkModel);
    }
}