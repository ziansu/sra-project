protected long doGetLastModifiedTime() throws java.lang.Exception {
    if ((getType()) == (org.apache.commons.vfs2.FileType.FOLDER)) {
        return -1;
    }
    return getS3Object(false).getLastModifiedDate().getTime();
}