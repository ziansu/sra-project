private boolean hasStickyHeader(int listChildPosition, int indexInList) {
    if ((listChildPosition > 0) || ((mAdapter.getHeaderId(indexInList)) < 0)) {
        return false;
    }
    return true;
}