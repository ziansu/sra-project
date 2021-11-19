@java.lang.Override
public java.nio.file.FileVisitResult postVisitDirectory(java.nio.file.Path director, java.io.IOException e) throws java.io.IOException {
    java.nio.file.Files.delete(directory);
    return java.nio.file.FileVisitResult.CONTINUE;
}