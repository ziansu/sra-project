public int getRow() {
    if ((top) == null) {
        return 0;
    }else {
        return (top.getRow()) + 1;
    }
}