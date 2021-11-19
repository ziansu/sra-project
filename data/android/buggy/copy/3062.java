@java.lang.Override
public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path dir, java.nio.file.attribute.BasicFileAttributes attrs) {
    find(dir);
    return java.nio.file.FileVisitResult.CONTINUE;
}