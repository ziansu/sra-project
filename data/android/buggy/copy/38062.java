protected java.lang.String getPath() {
    java.io.File executionDirectory = new java.io.File(java.lang.System.getProperty("user.dir"));
    return (executionDirectory.getParent()) + (java.io.File.separator);
}