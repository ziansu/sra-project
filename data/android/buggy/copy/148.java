@java.lang.Override
public java.util.List<com.example.android.booklisting.Book> loadInBackground() {
    if ((mUrl) == null) {
        return null;
    }
    java.util.List<com.example.android.booklisting.Book> books = com.example.android.booklisting.QueryUtils.fetchBookData(mUrl);
    return books;
}