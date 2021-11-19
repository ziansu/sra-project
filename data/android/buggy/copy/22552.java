public com.naver.svngit.TreeBuilder copy(java.lang.String sourcePath, java.lang.String destinationPath) {
    addings.remove(sourcePath);
    removings.remove(sourcePath);
    copyings.put(sourcePath, destinationPath);
    movings.remove(sourcePath);
    return this;
}