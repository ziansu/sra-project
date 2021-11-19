@java.lang.Override
public java.lang.Long call() throws java.lang.Exception {
    long result = bookmarksDBAdapter.addBookmarkIfNotExists(sura, ayah, page);
    bookmarksPublishSubject.onNext(null);
    return result;
}