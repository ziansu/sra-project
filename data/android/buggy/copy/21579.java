protected java.lang.String getParentPath(final java.lang.String href) {
    int pos = href.lastIndexOf("/");
    if (pos <= 0) {
        return null;
    }
    return href.substring(0, pos);
}