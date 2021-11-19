int getGIDForSID(int sid) {
    if (isCIDFont) {
        throw new java.lang.IllegalStateException("Not a Type 1-equivalent font");
    }
    java.lang.Integer gid = sidOrCidToGid.get(sid);
    if (gid == null) {
        return 0;
    }
    return gid;
}