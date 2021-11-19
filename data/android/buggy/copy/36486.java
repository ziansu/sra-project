private void excludeSpecialFolder(com.fsck.k9.search.LocalSearch search, java.lang.String folderName) {
    if (!(K9.FOLDER_NONE.equals(folderName))) {
        search.and(SearchField.FOLDER, folderName, Attribute.NOT_EQUALS);
    }
}