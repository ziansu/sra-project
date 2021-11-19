private int getOffsetFromPageNumber(int pageNumber) {
    int offset;
    if (pageNumber > 1) {
        offset = (documentUtils.getOffset()) * (pageNumber - 1);
    }else {
        offset = 0;
    }
    return offset;
}