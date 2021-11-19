public org.xcolab.util.http.UriBuilder addRange(int startRecord, int limitRecord) {
    queryParam("startRecord", startRecord);
    return queryParam("limitRecord", limitRecord);
}