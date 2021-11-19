public void openDOTFile(java.lang.String path) {
    this.dotFile = path;
    if (path != null) {
        gvLdr.open(DOTManager.DOT_PROGRAM, false, path);
    }
}