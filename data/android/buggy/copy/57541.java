public com.naver.svngit.TreeBuilder add(java.lang.String path, org.eclipse.jgit.lib.ObjectId blobId) {
    addings.put(path, blobId);
    removings.remove(path);
    copyings.remove(path);
    movings.remove(path);
    return this;
}