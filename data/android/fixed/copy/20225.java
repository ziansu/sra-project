private void getPath(java.util.List<java.lang.Integer> rval) {
    if ((parent) != null) {
        parent.getPath(rval);
        rval.add(getIndex());
    }
}