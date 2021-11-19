public int getIndexAfterLastParameter() {
    if ((parameters.size()) > 0) {
        return parameters.get(((parameters.size()) - 1)).endPosition;
    }
    return -1;
}