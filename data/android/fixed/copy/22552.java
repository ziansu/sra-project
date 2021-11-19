public com.naver.svngit.TreeBuilder copy(java.lang.String sourcePath, java.lang.String destinationPath) {
    copyings.put(sourcePath, destinationPath);
    return this;
}