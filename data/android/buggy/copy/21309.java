private void setBodyIfPresent() {
    java.util.List<java.lang.String> bodyParts = requestLines.subList(((headersBodyBreakIndex) + 1), ((requestLines.size()) - 1));
    request.body = buildBodyString(bodyParts);
}