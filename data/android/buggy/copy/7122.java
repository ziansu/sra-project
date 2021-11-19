@java.lang.Override
public java.nio.file.FileVisitResult visitFile(final java.nio.file.Path file, final java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    {
        final java.io.File fileFile = file.toFile();
        if (fileFilter.accept(fileFile)) {
            pass1StatsAdd(fileFile);
            return java.nio.file.FileVisitResult.CONTINUE;
        }
        return java.nio.file.FileVisitResult.SKIP_SUBTREE;
    }
}