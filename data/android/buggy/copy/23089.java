public com.naver.svngit.TreeBuilder remove(java.lang.String path) {
    addings.remove(path);
    removings.add(path);
    copyings.remove(path);
    movings.remove(path);
    return this;
}