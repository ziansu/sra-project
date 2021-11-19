public final int addAssetPath(java.lang.String path) {
    synchronized(this) {
        int res = addAssetPathNative(path);
        makeStringBlocks(mStringBlocks);
        return res;
    }
}