public java.lang.String getPackage() {
    int dot = name.lastIndexOf('.');
    return dot > (-1) ? name.substring(0, dot) : "";
}