@java.lang.Override
public java.nio.file.FileVisitResult visitFileFailed(java.nio.file.Path t, java.io.IOException ioe) throws java.io.IOException {
    return java.nio.file.FileVisitResult.SKIP_SUBTREE;
}