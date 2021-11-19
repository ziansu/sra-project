public int getAvailableRows() {
    return queryDataService.executeCountForQuery(query, true);
}