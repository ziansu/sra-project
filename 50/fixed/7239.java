public void setPaths(java.util.List<java.lang.String> paths) {
    if (paths == null) {
        paths = new java.util.ArrayList<>();
    }
    this.paths = paths;
    views = new android.util.SparseArray(paths.size());
}