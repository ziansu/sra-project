public void writerCreateToken(boolean allow) {
    if (!(changed)) {
        writeMode = (allow) ? AccessMode.Static.TOKEN_WRITE : AccessMode.Static.WRITE;
        changed = true;
    }
}