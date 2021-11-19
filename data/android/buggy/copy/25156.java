@java.lang.Override
public android.content.Loader<java.util.ArrayList<com.abigailmathews.bookworm.Book>> onCreateLoader(int id, android.os.Bundle args) {
    return new com.abigailmathews.bookworm.BookLoader(this, com.abigailmathews.bookworm.MainActivity.TEMP_QUERY);
}