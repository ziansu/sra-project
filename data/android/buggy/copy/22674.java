public void setFixpath(final java.lang.String fixpath) {
    assert fixpath != null ? !(toFile(fixpath).isAbsolute()) : true;
    this.fixpath = fixpath;
}