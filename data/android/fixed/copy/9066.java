public java.util.List<java.lang.String> executeTextFileStyle(java.util.List<java.lang.String> textJavacode, java.lang.String configClasspath) {
    this.manualJavacode = textJavacode;
    this.configClasspath = configClasspath;
    return process();
}