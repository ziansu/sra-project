private boolean wasBookExitsInLibrary(java.lang.String path) {
    for (com.ctt535.start.shambook.BookInformation book : allBooks) {
        java.lang.String bPath = book.getFilePath();
        if (bPath.equals(path)) {
            return true;
        }
    }
    return false;
}