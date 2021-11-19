public org.xcolab.util.http.UriBuilder addRange(int startRecord, int limitRecord) {
    queryParam("startRecord", startRecord);
    queryParam("limitRecord", limitRecord);
    return this;
}