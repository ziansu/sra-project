void updatePageNumber() {
    while (((pageNumber) > 0) && (((pageNumber) * (pageLength)) >= (pagedDataProvider.getBackendSize()))) {
        --(pageNumber);
    } 
}