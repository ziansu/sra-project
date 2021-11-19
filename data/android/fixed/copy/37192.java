private java.lang.String updateURL(java.lang.String searchWord) {
    if (searchWord != null) {
        java.lang.String updatedURL = ((com.example.android.booklistingproject_udacity.BookActivity.GOOGLE_BOOK_URL) + searchWord) + "&maxResults=30";
        return updatedURL;
    }
    return null;
}