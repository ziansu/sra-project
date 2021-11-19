public int numberOfVersions() {
    int result = 0;
    if ((contents.size()) > 0) {
        for (final org.alfresco.extension.bulkimport.source.BulkImportItem item : contents) {
            result += item.numberOfVersions();
        }
    }
    return result;
}