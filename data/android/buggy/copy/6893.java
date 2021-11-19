public int getGID(int cid) {
    if (isIdentity) {
        return cid;
    }else {
        if (cid < (mapping.length)) {
            return mapping[cid];
        }else {
            return 0;
        }
    }
}