public int getNumRecords() {
    if (((response) != null) && (!(response.isEmpty()))) {
        return response.getSearchHit().size();
    }else {
        return -1;
    }
}