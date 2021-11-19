public boolean hasNext() {
    if ((totalRecordCount) > (((from) + (position)) + 1)) {
        return true;
    }else {
        return false;
    }
}