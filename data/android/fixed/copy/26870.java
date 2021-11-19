@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    boolean result = bookmarksDBAdapter.tagBookmarks(bookmarkIds, tagIds, deleteNonTagged);
    if (result) {
        bookmarksPublishSubject.onNext(true);
    }
    return result;
}