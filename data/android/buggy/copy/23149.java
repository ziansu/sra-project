public void setAbsolutePathByString(java.lang.String pathString, java.lang.String prefix) {
    this.prefix = prefix;
    setPathByString(pathString.substring(prefix.length(), pathString.length()));
}