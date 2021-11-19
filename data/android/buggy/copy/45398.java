public int getEndPosition() {
    if ((namespace) == null) {
        return position;
    }else {
        return ((position) + (namespace.length())) + 1;
    }
}