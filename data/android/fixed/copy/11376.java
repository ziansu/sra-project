public models.Node readCachedNode(java.lang.String pid) {
    models.Node c = readNodeFromCache(pid);
    if (c == null) {
        return readNode(pid);
    }
    return c;
}