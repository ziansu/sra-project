@java.lang.Override
public java.lang.String getRequestPath() {
    final java.lang.String path = super.getRequestPath();
    if ((path.indexOf(getLibrary())) > 0) {
        return path + (getVersion());
    }else {
        return path;
    }
}