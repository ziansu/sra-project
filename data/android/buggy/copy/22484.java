public com.naver.svngit.TreeBuilder move(java.lang.String sourcePath, java.lang.String destinationPath) {
    addings.remove(sourcePath);
    removings.remove(sourcePath);
    copyings.remove(sourcePath);
    movings.put(sourcePath, destinationPath);
    return this;
}