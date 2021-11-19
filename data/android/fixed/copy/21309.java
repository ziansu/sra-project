private void setBodyIfPresent() {
    java.util.List<java.lang.String> bodyParts = requestLines.subList(((headersBodyBreakIndex) + 1), requestLines.size());
    request.body = buildBodyString(bodyParts);
}