public void openDOTFile(java.lang.String path) {
    this.dotFile = path;
    java.lang.System.out.println(("OpenDotFile: " + path));
    gvLdr.open(DOTManager.DOT_PROGRAM, false, path);
}