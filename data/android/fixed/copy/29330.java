void parseQueryParameters() {
    int queryEnd = ((fragment) == (-1)) ? raw.length() : (fragment) - 1;
    queryPositions = io.datakernel.http.HttpUrl.doParseParameters(raw, query, queryEnd);
}