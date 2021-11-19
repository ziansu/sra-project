@java.lang.Override
public android.content.Loader<java.util.List<com.example.android.booklistingproject_udacity.Book>> onCreateLoader(int i, android.os.Bundle bundle) {
    java.lang.String url = updateURL(mKeyword.toString());
    return new com.example.android.booklistingproject_udacity.BookLoader(this, url);
}